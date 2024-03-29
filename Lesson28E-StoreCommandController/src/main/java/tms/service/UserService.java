package tms.service;

import tms.model.User;

public interface UserService {

    void addUser(User user);

    User getUserByLogin(String login);

    Long getUserId(String login);

    boolean isVerifiedUser(String login, String password);
}