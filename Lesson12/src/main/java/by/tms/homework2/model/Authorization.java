package by.tms.homework2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@ToString
@Setter
@Getter

public class Authorization {
    private String password;
    private String login;
    private String confirmPassword;

    public Authorization(String password, String login, String confirmPassword) {
        this.password = password;
        this.login = login;
        this.confirmPassword = confirmPassword;
    }

    public static boolean checkLogin(String login) {
        if (login.length() > 20 || login == null) {
            return false;
        }
        for (int i = 0; i < login.length(); i++) {
            char c = login.charAt(i);
            int n = login.charAt(i);
            char underSlash = '_';
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && n != login.charAt(i)) {
                if (!(underSlash == '_')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkPassword(String password) {
        if (password.length() > 20 || password == null) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            int n = password.charAt(i);
            char underSlash = '_';
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && n != password.charAt(i)) {
                if (!(underSlash == '_')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkConfirmPassword(String password, String confirmPassword) {
        return Objects.equals(password, confirmPassword);
    }

    public static boolean checkAuthorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            if (checkLogin(login) && checkPassword(password) && checkConfirmPassword(password, confirmPassword)) {
                System.out.println("You have logged in");
                return true;
            } else if (!checkLogin(login) || login == null) {
                throw new WrongLoginException("You have entered wrong login");
            } else if (!checkPassword(password) || !checkConfirmPassword(password, confirmPassword) || checkPassword(password) != checkConfirmPassword(password, confirmPassword)) {
                throw new WrongPasswordException("You have entered wrong password");
            } else {
                return false;
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
