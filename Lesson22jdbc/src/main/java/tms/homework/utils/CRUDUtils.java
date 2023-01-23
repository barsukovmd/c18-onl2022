package tms.homework.utils;

import tms.homework.model.Worker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_WORKERS_QUERY = "SELECT * FROM workers_db.workers";
    private static final String INSERT_WORKERS_QUERY = "INSERT INTO workers_db.workers (id, login, salary, age, date, description, name) VALUES(?, ?, ?, ?, ?, ?, ?)";
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
                int age = resultSet.getInt("age");
                Date date = resultSet.getDate("date");
                String description = resultSet.getString("description");
                String name = resultSet.getString("name");
                workerList.add(new Worker(id, login, salary, age, date, description, name));
            }
            return workerList;
        } catch (SQLException e) {
            System.out.println(e.getMessage() + " Error");
        }
        return workerList;
    }

    private static List<Worker> getNewWorker(Worker worker) {
        List<Worker> newWorkers = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_WORKERS_QUERY);
            preparedStatement.setInt(1, worker.getId());
            preparedStatement.setString(2, worker.getLogin());
            preparedStatement.setDouble(3, worker.getSalary());
            preparedStatement.setInt(4, worker.getAge());
            preparedStatement.setDate(5, worker.getDate());
            preparedStatement.setString(6, worker.getDescription());
            preparedStatement.setString(7, worker.getName());
            newWorkers = getAllWorkers();
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return newWorkers;
    }
}
