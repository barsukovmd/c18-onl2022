package main.repository;

import main.models.User;

public interface JdbcUserRepository {
    void addUser(User user);

    User getUserByLogin(String login);

    Long getUserById(String login);
}
