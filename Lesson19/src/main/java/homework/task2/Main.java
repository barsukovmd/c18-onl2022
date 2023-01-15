package homework.task2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// * 2) Определение количества четных чисел в потоке данных.
// * Создаем коллекцию Set<Integer> в которую добавляем рандомно 50 чисел от 0 до 100
// *
public class Main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        Random random = new Random();
        int number;
        for (int i = 0; i <= 50; i++) {
            number = random.nextInt(101);
            integerSet.add(number);
        }
        integerSet.stream()
                .filter(even -> even % 2 == 0)
                .forEach(System.out::println);
    }
}
