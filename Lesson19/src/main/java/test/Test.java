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

        Printable printable = System.out::println;
        printable.print("Hello Java");

        int m = 10;
        int n = 15;
        Operation2 operation2 = () -> m * n;
        System.out.println(operation2.calculate());
        Expression function = n1 -> n % 2 == 0;
        int[] nums1 = {1, 23, 12, 30, 3, 12, 31, 23, 4, 245, 3, 5, 6};
        System.out.println(sum(nums1, function));

        int[] nums = {1, 23, 12, 31, 3, 12, 31, 23, 4, 245, 3, 5, 6};
        int x = sum(nums, n1 -> n > 5);
        System.out.println(x);

    }

    private static int sum(int[] ints, Expression expression) {
        int result = 0;
        for (int value : ints) {
            if (expression.isEqual(value)) {
                result += value;
            }
        }
        return result;
    }


    @FunctionalInterface
    public interface Operation {
        int calculate(int a, int b);
    }

    @FunctionalInterface
    public interface Operation2 {
        int calculate();
    }


    @FunctionalInterface
    public interface Printable {
        void print(String s);
    }

    @FunctionalInterface
    public interface Expression {
        boolean isEqual(int n);
    }

}
