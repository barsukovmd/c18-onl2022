package main.service;

public interface AuthenticatorService {
    boolean isVerifiedUser(String login, String password);
}
