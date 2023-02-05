package main.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.UtilityClass;

@UtilityClass
@Getter
@Setter
public class User {
    private final String username = "Username";
    private final String password = "Password";
}
