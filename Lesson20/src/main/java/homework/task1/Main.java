package homework.task1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
        На закрепление по коллекциям! Можно использовать stream API !
        1)Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
         Избавиться от повторяющихся элементов в строке и вывести результат на экран.
      */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Set<String> numberSet = new LinkedHashSet<>(Arrays.asList(scanner.nextLine().split(" ")));
        numberSet
                .forEach(System.out::println);
    }
}
