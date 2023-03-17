package main.service.impl;

import main.models.Authenticator;
import main.models.User;
import main.service.AuthenticatorService;
import main.service.UserService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthenticatorServiceImpl implements AuthenticatorService {
    private UserService userService;
    private Authenticator authenticator;

    public void putUser(User user) {
        authenticator.getAuthenticators().put(user.getLogin(), user.getPassword());
    }

    @Override
    public boolean isVerifiedUser(String login, String password) {
        User user = userService.getUserByLogin(login);
        if (user != null) {
            putUser(user);
            return true;
        }
        return false;
    }
}
