package by.tms.onlinestore.repository.impl;

import by.tms.onlinestore.model.User;
import by.tms.onlinestore.repository.UserRepository;
import by.tms.onlinestore.repository.utils.ConnectionWrapper;
import lombok.Setter;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Setter
public class UserRepositoryImpl implements UserRepository {

    private static final String GET_USERS_INFO = "select login, password from \"online-store\".users";
    private static final String INSERT_USER_QUERY = "insert into \"online-store\".users (id, login, password, name, surname, date_of_birth, sex, email, date_of_registry) values (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String GET_USER_BY_LOGIN_AND_PASSWORD = "SELECT login, password, name, surname, date_of_birth, sex, email, date_of_registry FROM \"online-store\".users WHERE login = ? AND password = ?";

    @Override
    public void getUserInfo(User user) {
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             PreparedStatement preparedStatement = connectionWrapper.getConnection().prepareStatement(GET_USERS_INFO)) {
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addNewUser(User user) {
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             PreparedStatement statement = connectionWrapper.getConnection().prepareStatement(INSERT_USER_QUERY)) {
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getName());
            statement.setString(4, user.getSurname());
            statement.setDate(5, Date.valueOf(user.getDateOfBirth()));
            statement.setString(6, user.getSex());
            statement.setString(7, user.getEmail());
            statement.setDate(8, Date.valueOf(user.getDateOfRegistry()));
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Exception in addNewUser: " + e.getMessage());
        }
    }

    @Override
    public User getUserByLoginAndPassword(String login, String password) {
        User user = null;
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             PreparedStatement statement = connectionWrapper.getConnection().prepareStatement(GET_USER_BY_LOGIN_AND_PASSWORD)) {
            statement.setString(1, login);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                user = User.builder()
                        .login(rs.getString("login"))
                        .password(rs.getString("password"))
                        .name(rs.getString("name"))
                        .surname(rs.getString("surname"))
                        .dateOfBirth(rs.getString("dateOfBirth"))
                        .sex(rs.getString("sex"))
                        .email(rs.getString("email"))
                        .dateOfRegistry(rs.getString("registration_date"))
                        .build();
            }
        } catch (Exception e) {
            System.out.println("Exception connectionWrapper.getConnection().prepareStatement(GET_USER_BY_LOGIN_AND_PASSWORD): " + e.getMessage());
        }
        return user;
    }
}
