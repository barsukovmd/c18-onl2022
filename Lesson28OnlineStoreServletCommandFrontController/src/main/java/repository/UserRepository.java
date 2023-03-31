package repository;

import models.User;

public interface UserRepository extends Repository {
    void addNewUser(User user);

    User getUserByLoginAndPassword(String login, String password);
}
