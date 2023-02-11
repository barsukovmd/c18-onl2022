package repository;

import lombok.Getter;
import model.City;
import model.Students;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Getter
public class DatabaseRepository implements StudentsRepository {
    private final Connection connection;
    private final String PATH = "select students_db.students.id, name, surname, age, course, city_id from students_db.students";
    private final String PATH2JOIN = "SELECT * from students_db.students left join students_db.city c on c.id_for_city = students.city_id";

    public DatabaseRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
// private City city;
//    private int id;
//    private String name;
//    private String surname;
//    private int age;
//    private int course;
//    private int cityId;
    public List<Students> searchStudents() {
        List<Students> students = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(PATH2JOIN);
            while (resultSet.next()) {
                int idForCity = resultSet.getInt("id_for_city");
                String cityName = resultSet.getString("city");
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                int course = resultSet.getInt("course");
                int cityId = resultSet.getInt("city_id");
                Students student = new Students(new City(idForCity, cityName), id, name, surname, age, course, cityId);
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
