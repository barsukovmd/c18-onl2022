package two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(10));
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(5);
        integers.add(3);
        integers.add(100);
        integers.stream()
                .filter(a -> a >= 10)
                .toList().forEach(System.out::println);

        List<Integer> prices = new ArrayList<>();
        prices.add(45324);
        prices.add(1000);
        prices.add(4756);
        prices.add(237528);
        prices.stream()
                .filter(price -> price > 10000)
                .forEach(System.out::println);


    }
}
//тернарный оператор
