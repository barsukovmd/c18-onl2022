package springbootexample.entities;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import springbootexample.utils.PasswordConstraint;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class User extends BaseEntity {

    private String name;
    private String surname;
    private String email;
    @PasswordConstraint
    private String password;
    private Date birthday;
    private int balance;

}
