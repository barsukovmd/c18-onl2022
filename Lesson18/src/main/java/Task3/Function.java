package Task3;

import lombok.NonNull;
import lombok.ToString;

import java.util.Scanner;

@ToString
@NonNull

public class Function implements Functional {
    //     * Дополнительное задание
////     * 3. Создать обобщенный функциональный интерфейс.
////     * Написать класс с одним методом.
////     * В этом методе реализуйте логику:
////     * - если в консоль введена цифра 1, то: использования интерфейса со
////     * строковым типом и передать в метод интерфейса логику реверса
////     * строки(вывода строки в обратном порядке).
////     * - если в консоль введена цифра 2, то: использования интерфейса с
////     * целочисленным типом и передать в метод интерфейса логику
////     * нахождения факториала числа.
    private Scanner scanner;

    @Override
    public Function getFunction(int number) {
        switch (number) {
            case 1 -> {
                Functional<String> stringFunctional = number1 -> "Hello";
                return (Function) stringFunctional;
            }
            case 2 -> {
                Functional<Integer> integerFunctional = number1 -> 100;
                return (Function) integerFunctional;
            }
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }
    }
}
