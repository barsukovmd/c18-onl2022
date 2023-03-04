package models;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Date;


@Getter
@ToString
public class UserUnder18 extends User {
    UserUnder18(int id, String name, String surname, String email, String password, Date birthday, int balance) {
        super(id, name, surname, email, password, birthday, balance);
    }
}
