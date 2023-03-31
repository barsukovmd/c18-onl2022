package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Getter
@Setter
public class UserDto implements Serializable {
    private String username;
    private String name;
    private String surname;
    private String sex;
    private String birthday;
    private String email;
    private String dateOfSignUp;
}
