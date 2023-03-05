package streamTasks;

import java.util.Arrays;
import java.util.List;

//// Вывести на экран отсортированный по возрастанию список городов в Uppercase начинающихся с М
//        List<String> myList = Arrays.asList("Minsk", "Madrid", "Gomel", "Barcelona", "Milan", "Munchen");
public class SortCitiesByStream {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Minsk", "Madrid", "Gomel", "Barcelona", "Milan", "Munchen");
        myList.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("M"))
                .sorted()
                .forEach(System.out::println);
    }
}
