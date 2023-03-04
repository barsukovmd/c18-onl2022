package models;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@ToString
public class UserAbove18 extends User {
    UserAbove18(int id, String name, String surname, String email, String password, Date birthday, int balance) {
        super(id, name, surname, email, password, birthday, balance);
    }
}
