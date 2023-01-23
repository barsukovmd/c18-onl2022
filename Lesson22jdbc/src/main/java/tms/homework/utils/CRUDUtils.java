package tms.homework.utils;

import tms.homework.model.Worker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private final static String DB_URL = "jdbc:postgresql://localhost:5432/c18-onl2022";
    private final static String DB_LOGIN = "postgres";
    private final static String DB_PASSWORD = "Barsukov28071992";

    public CRUDUtils() {
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

    public static List<Worker> getAllWorkers() {
        List<Worker> workers = new ArrayList<>();
        try (Connection connection =) {

        } catch (SQLException e) {
            System.out.println(e.getMessage() + " Error");
        }
    }
}
