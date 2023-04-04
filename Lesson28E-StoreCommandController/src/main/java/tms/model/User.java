package tms.model;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@Builder
@ToString
public class User {
    private Long id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthday;
}