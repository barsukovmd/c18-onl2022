package task4;

import lombok.experimental.UtilityClass;

@UtilityClass
//// * 4)Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - sum, multiply, divide,
//// * subtraction. Параметры этих методов - два числа разного типа, над которыми должна быть произведена операция.
//// */
public class Calculator {
    public static <T extends Number, V extends Number> double sum(T t, V v) {
        return t.doubleValue() + v.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T t, V v) {
        return t.doubleValue() * v.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T t, V v) {
        return t.doubleValue() / v.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T t, V v) {
        return t.doubleValue() - v.doubleValue();
    }
}
