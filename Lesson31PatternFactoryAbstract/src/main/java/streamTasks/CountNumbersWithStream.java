package streamTasks;

import com.oracle.wls.shaded.org.apache.xalan.transformer.Counter;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//// Сделать вывод в формате: число из списка + "-Hello" и то,
// сколько раз это число встречалось в списке, при этом не делать вывод для 4 и 6
//    List<Integer> integers = List.of(1, 2, 5, 4, 4, 5, 2, 3, 6, 5);
public class CountNumbersWithStream {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 5, 4, 4, 5, 2, 3, 6, 5);
        System.out.printf(integers.stream()
                .filter(integer -> integer != 4)
                .filter(integer -> integer != 6)
                .count() + "-Hello");
    }
}
