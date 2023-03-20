package repository.utils;

import java.sql.Connection;
import lombok.Getter;

@Getter
public class ConnectionWrapper implements AutoCloseable {
    private final Connection connection;
    private final ConnectionPool connectionPool;

    public ConnectionWrapper(Connection connection, ConnectionPool connectionPool) {
        this.connection = connection;
        this.connectionPool = connectionPool;
    }

    @Override
    public void close() throws Exception {
        connectionPool.closeConnection(this);
    }
}
