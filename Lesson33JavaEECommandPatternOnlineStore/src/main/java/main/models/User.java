package main.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;
import java.time.LocalDate;

@EqualsAndHashCode
@Getter
@Setter
@Builder
public class User {
    private Long id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private String email;
    private Timestamp dateOfBirth;

    public User(String login) {
        this.login = login;
    }
}
