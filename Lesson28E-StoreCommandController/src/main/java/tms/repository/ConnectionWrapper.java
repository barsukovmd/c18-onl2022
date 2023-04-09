package tms.repository;

import lombok.AllArgsConstructor;

import java.sql.Connection;

@AllArgsConstructor
public class ConnectionWrapper implements AutoCloseable {

    private final ConnectionPool connectionPool;
    private final Connection connection;

    @Override
    public void close() throws Exception {
        connectionPool.closeConnection(this);
    }

    public Connection getConnection() {
        return connection;
    }
}