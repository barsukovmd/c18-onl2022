package tms.homework.task1.jdbc.utils;

import tms.homework.task1.jdbc.models.City;
import tms.homework.task1.jdbc.models.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//CRUD - create, read, update and delete.
public class CRUDUtils {
    //    Предусмотреть операции добавления новых городов, новых
////     * студентов, удаления студентов и удаления городов.
////     *
    private static final String GET_ALL_STUDENTS_QUERY = "SELECT * FROM students_db.students";
    private static final String INSERT_STUDENT_QUERY = "INSERT INTO students_db.students(id, name, surname, age, course) VALUES(?, ?, ?, ?, ?);";
    private static final String INSERT_CITY_QUERY = "INSERT INTO cities (city, students) VALUES (?,?);";
    private static final String UPDATE_STUDENT_QUERY = "UPDATE students_db.students SET course = ? WHERE id = ?;";
    private static final String DELETE_STUDENT_QUERY = "DELETE FROM students_db.students WHERE students = ?";
    private static final String DELETE_CITY_QUERY = "DELETE FROM cities WHERE cities, students = ?,? ";


    public CRUDUtils() {
    }

    public static List<Student> getStudents() {
        List<Student> studentsList = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_STUDENTS_QUERY);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                int course = resultSet.getInt("course");
                studentsList.add(new Student(id, name, surname, age, course));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage() + " Exception");
        }
        return studentsList;
    }

    public static List<City> getCities() {
        List<City> cityList = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(INSERT_CITY_QUERY);
            while (resultSet.next()) {
                String city = resultSet.getString("city");
                Student student = (Student) resultSet.getObject("student");
                cityList.add(new City(city, student));
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + " Exception");
        }
        return cityList;
    }

    public static List<Student> insertNewStudents(Student student) {
        List<Student> insertNewStudents = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_QUERY);
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getSurname());
            preparedStatement.setInt(4, student.getAge());
            preparedStatement.setInt(5, student.getCourse());
            preparedStatement.executeUpdate();
            insertNewStudents = getStudents();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + " Exception");
        }
        return insertNewStudents;
    }

    public static List<City> insertNewCity(City city, Student student) {
        List<City> cityList = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CITY_QUERY);
            preparedStatement.setString(1, city.getCityName());
            preparedStatement.setString(2, student.getName() + student.getSurname());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + " Exception");
        }
        return cityList;
    }

    public static List<Student> updateStudents(int id, int course) {
        List<Student> updateStudents = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT_QUERY);
            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2, course);
            preparedStatement.executeUpdate();
            updateStudents = getStudents();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + " Exception");
        }
        return updateStudents;
    }

    public static List<Student> deleteStudent(int id) {
        List<Student> studentList = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_QUERY);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            studentList = getStudents();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + " Exception");
        }
        return studentList;
    }

    public static List<City> deleteCity(Student student, City city) {
        List<City> cityList = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CITY_QUERY);
            preparedStatement.setString(1, student.getName() + student.getSurname());
            preparedStatement.setString(2, city.getCityName());
            preparedStatement.executeUpdate();
            cityList = getCities();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + " Exception");
        }
        return cityList;
    }
}

