package homework.task1;

import java.util.Arrays;
import java.util.List;

///**
// * Все задачи необходимо решать используя Stream API и выводить результат на консоль !!!
// * 1) Вывести список чисел, умноженных на 2. Список чисел задаем рандомно.
// *
public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(23, 4, 234, 1, 31, 4, 324, 23, 5);
        integerList.stream()
                .map(multiplyList -> multiplyList * 2)
                .forEach(System.out::println);
    }
}
