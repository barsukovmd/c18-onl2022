package model;

import lombok.experimental.UtilityClass;

@UtilityClass
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

    private Double calculate(double value1, double value2, Calculation calculation) {
        return switch (calculation) {
            case SUM -> value1 + value2;
            case SUBTRACTION -> value1 - value2;
            case MULTIPLY -> value1 * value2;
            case DIVISION -> value1 / value2;
        };
    }

    public enum Calculation {
        SUM, SUBTRACTION, MULTIPLY, DIVISION
    }
}
