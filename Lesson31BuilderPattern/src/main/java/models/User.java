package models;

import lombok.Builder;
import lombok.ToString;
import java.util.Date;

@Builder
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
