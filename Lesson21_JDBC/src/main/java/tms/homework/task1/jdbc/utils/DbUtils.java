package tms.homework.task1.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Db - Database
public class DbUtils {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/c18-onl2022";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "Barsukov28071992";

    public DbUtils() {
    }

    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage() + " Exception");
        }
        return connection;
    }
}
