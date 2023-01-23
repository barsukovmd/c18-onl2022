package tms.homework.utils;

import tms.homework.model.Worker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_WORKERS_QUERY = "SELECT * FROM workers_db.workers";
    private static final String INSERT_WORKERS_QUERY = "INSERT INTO workers_db.workers (id, login, salary, age, date, description) VALUES(?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_WORKERS_QUERY = "UPDATE workers_db.workers SET course = ? WHERE id = ?";
    private static final String DELETE_WORKERS_QUERY = "DELETE FROM workers_db.workers WHERE id = ?";

    public static List<Worker> getAllWorkers() {
        List<Worker> workerList = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_WORKERS_QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String login = resultSet.getString("login");
                double salary = resultSet.getDouble("salary");
                Date date = resultSet.getDate("date");

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage() + " Error");
        }
        return workerList;
    }
}
