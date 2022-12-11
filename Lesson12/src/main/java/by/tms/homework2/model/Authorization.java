package by.tms.homework2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;


@Setter
@Getter
@AllArgsConstructor
@ToString

public class Authorization {
    private String password;
    private String login;
    private String confirmPassword;


    public static boolean checkLogin(String login) {
        if (login.length() > 20 || login == null) {
            return false;
        }
        for (int i = 0; i < login.length(); i++) {
            char c = login.charAt(i);//нашел этот метод для использования в нашем задании
            int n = login.charAt(i);
            char underSlash = '_';//подскажите можно ли так сделать
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && login.length() <= 20 && n != login.charAt(i)) {
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
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && password.length() <= 20 && n != password.charAt(i)) {
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

    public static boolean checkAuthorization(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        try {
            if (checkLogin(login) && checkPassword(password) && checkConfirmPassword(password, confirmPassword)) {
                System.out.println("You have logged in");
                return true;
            } else if (!checkLogin(login) && login != null) {
                throw new WrongLoginException("You have entered wrong login");
            } else if (!checkPassword(password) && !checkConfirmPassword(password, confirmPassword) || checkPassword(password) != checkConfirmPassword(password, confirmPassword)) {
                throw new WrongPasswordException("You have entered wrong password");
            } else {
                return false;
            }
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (WrongPasswordException e) {//можно сделать collapse(), чтобы через | было
            System.out.println(e.getMessage());
            return false;
        }
    }
}
