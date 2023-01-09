package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Test {
    public static void main(String[] args) {
        List<People> people = new ArrayList<>();
        People[] people1 = new People[10];
        people.add(new People("Alex", 20, 1));
        people.add(new People("Mike", 25, 2));
        people.add(new People("Niki", 30, 3));
        people.add(new People("Mirka", 23, 4));
        Arrays.stream(people1);
        BiPredicate<People, Integer> biPredicate = (person, value) -> person.getAge() > value;
        boolean test = biPredicate.test(new People("Mirka", 23, 4), 10);
        System.out.println(test);

        Operation multiply = (a, b) -> a * b;
        System.out.println(multiply.calculate(12, 12));
        Operation sum = Integer::sum;
        System.out.println(sum.calculate(10, 12));
        Operation divide = (a, b) -> a / b;
        System.out.println(divide.calculate(100, 20));
        Operation minus = (a, b) -> a - b;
        System.out.println(minus.calculate(101, 20));
    }


    @FunctionalInterface
    public interface Operation {
        int calculate(int a, int b);
    }
}
