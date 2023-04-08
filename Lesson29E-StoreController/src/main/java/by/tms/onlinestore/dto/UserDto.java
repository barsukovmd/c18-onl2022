package by.tms.onlinestore.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
@SuperBuilder
public class UserDto {
    private String login;
    private String name;
    private String surname;
    private String sex;
    private String dateOfBirth;
    private String email;
    private String dateOfRegistry;
}
