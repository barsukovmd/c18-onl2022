package main.service;

import main.models.User;

public interface UserService {
    void addUser(User user);

    User getUserByLogin(String login);

    Long getUserId(String login);
}
