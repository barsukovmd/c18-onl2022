package repository.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ConnectionPool {
    private static volatile ConnectionPool instance;
    private static final String DB_PROPERTY_FILE = "application";
    private static final String DB_URL = "db.url";
    private static final String DB_LOGIN = "db.login";
    private static final String DB_PASSWORD = "db.password";
    private static final int MAX_CONNECTION_COUNT = 10;
    private static final int MIN_CONNECTION_COUNT = 5;
    private static String url;
    private static String login;
    private static String password;

    static {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(DB_PROPERTY_FILE);
        url = resourceBundle.getString(DB_URL);
        login = resourceBundle.getString(DB_LOGIN);
        password = resourceBundle.getString(DB_PASSWORD);
    }

    private final AtomicInteger currentConnectionNumber = new AtomicInteger(MIN_CONNECTION_COUNT);
    private final BlockingQueue<ConnectionWrapper> pool = new ArrayBlockingQueue<>(MAX_CONNECTION_COUNT, true);

    public static ConnectionPool getInstance() {
        if (instance == null) {
            synchronized (ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool();
                }
            }
        }
        return instance;
    }

    public ConnectionPool() {
        for (int i = 0; i < MIN_CONNECTION_COUNT; i++) {
            try {
                pool.add(new ConnectionWrapper(DriverManager.getConnection(url, login, password), this));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void openAdditionalConnection() throws Exception {
        for (int i = 0; i < MAX_CONNECTION_COUNT; i++) {
            try {
                pool.add(new ConnectionWrapper(DriverManager.getConnection(url, login, password), this));
                currentConnectionNumber.getAndIncrement();
            } catch (SQLException exception) {
                throw new Exception("New connection was not created in the current pool: " + exception);
            }
        }
    }

    public ConnectionWrapper connectionWrapper() throws Exception {
        ConnectionWrapper connectionWrapper;
        try {
            if (pool.isEmpty() && currentConnectionNumber.get() < MAX_CONNECTION_COUNT) {
                openAdditionalConnection();
            }
            connectionWrapper = pool.take();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new Exception("Max count of connections was successfully reached");
        }
        return connectionWrapper;
    }


    public void closeConnection(ConnectionWrapper connectionWrapper) throws Exception {
        if (connectionWrapper != null) {
            if (currentConnectionNumber.get() > MIN_CONNECTION_COUNT) {
                currentConnectionNumber.decrementAndGet();
            }
            try {
                pool.put(connectionWrapper);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new Exception("Connection wasn't returned into pool properly");
            }
        }
    }
}
