package tms.homework.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
    private final static String DB_URL = "jdbc:postgresql://localhost:5432/c18-onl2022";
    private final static String DB_LOGIN = "postgres";
    private final static String DB_PASSWORD = "Barsukov28071992";

    public DbUtils() {
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);

        } catch (SQLException e) {
            System.out.println(e.getMessage() + "Error");
        }
        return connection;
    }

}
