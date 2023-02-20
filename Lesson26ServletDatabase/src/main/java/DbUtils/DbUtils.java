package DbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/c18-onl2022";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "Barsukov28071992";

    private DbUtils() {
    }

    public static Connection getConnection() throws SQLException {
        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return connection;
    }
}
