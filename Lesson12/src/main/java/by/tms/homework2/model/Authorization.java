package by.tms.homework2.model;

import java.util.Objects;
import java.util.Scanner;

public class Authorization {
    private String password;
    private String login;
    private String confirmPassword;

    public void checkAuthorization(String login, String password, String confirmPassword) throws Exception {
        Scanner scanner = new Scanner(System.in);
        login = scanner.nextLine();
        password = scanner.nextLine();
        confirmPassword = scanner.nextLine();
        if (Objects.equals(password, confirmPassword)) {

        } else {
            WrongLoginException();
        }
    }

    private void WrongLoginException() throws WrongLoginException {
    }
}
