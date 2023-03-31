package utils;

import dto.UserDto;
import lombok.experimental.UtilityClass;
import models.User;

import java.util.Optional;

//login&password class
@UtilityClass
public class Utils {
    public static boolean isVerifiedLogin(UserDto userDto) {
        return Optional.ofNullable(userDto).isPresent();
    }
}
