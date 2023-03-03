package streamTasks;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//// Сделать вывод в формате: число из списка + "-Hello" и то,
// сколько раз это число встречалось в списке, при этом не делать вывод для 4 и 6
//    List<Integer> integers = List.of(1, 2, 5, 4, 4, 5, 2, 3, 6, 5);
public class CountNumbersWithStream {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 5, 4, 4, 5, 2, 3, 6, 5);
        integers.stream()
                .filter(integer -> integer != 4)
                .filter(integer -> integer != 6)
                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() > 0)
                .forEach(count -> System.out.println(count.getKey() + ":" + count.getValue() + " -Hello"));
//        System.out.println(integers.stream()
//                .filter(integer -> integer != 4)
//                .filter(integer -> integer != 6)
//                .collect(Collections.frequency(integers,)!=4||6)
//                .count() + "-Hello");
//        integers.forEach(System.out::print);
    }
}
