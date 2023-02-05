package model;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.UtilityClass;

@UtilityClass
@Getter
@Setter
public class Calculator {
    public static <T extends Number, K extends Number> double sum(T t, K k) {
        return t.doubleValue() + k.doubleValue();
    }

    public static <T extends Number, K extends Number> double subtraction(T t, K k) {
        return t.doubleValue() - k.doubleValue();
    }

    public static <T extends Number, K extends Number> double multiply(T t, K k) {
        return t.doubleValue() * k.doubleValue();
    }

    public static <T extends Number, K extends Number> double division(T t, K k) {
        return t.doubleValue() / k.doubleValue();
    }
}
