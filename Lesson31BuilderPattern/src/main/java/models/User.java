package models;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@SuperBuilder
@ToString
public class User {
    private final int id;
    private final String name;
    private final String surname;
    private final String email;
    private final String password;
    private final Date birthday;
    private final int balance;
}
