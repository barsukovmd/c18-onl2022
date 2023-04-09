package main.repository.impl;

import main.models.User;
import main.repository.JdbcUserRepository;
import org.eclipse.tags.shaded.org.apache.xalan.lib.sql.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.LocalDate;

public class JdbcUserRepositoryImpl implements JdbcUserRepository {
    private ConnectionPool connectionPool;
    private static final String ADD_USER = "insert into users (login, password, name, surname, email, birthday) values (?, ?, ?, ?, ?, ?)";
    private static final String GET_USER_BY_LOGIN = "select * from users where login=?";
    private static final String GET_USER_ID = "select id from users where login=?";

    @Override
    public void addUser(User user) {
        Connection connection = null;
        try {
            connection = connectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_USER);
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getName());
            preparedStatement.setString(4, user.getSurname());
            preparedStatement.setString(5, user.getEmail());
            preparedStatement.setTimestamp(6, user.getDateOfBirth());
        } catch (Exception e) {
            System.out.println("Exception (addUser()): " + e.getMessage());
        }
    }

    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public Long getUserById(String login) {
        return null;
    }
}
