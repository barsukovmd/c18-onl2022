package repository;

import lombok.Getter;
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
    private final String PATH = "select students_db.students.name from students_db.students";

    public DatabaseRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Students> searchStudents() {
        List<Students> students = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(PATH);
            while (resultSet.next()) {
                final Students student = new Students(resultSet.getString("name"));
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
