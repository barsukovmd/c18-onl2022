package test;

import java.util.function.IntBinaryOperator;

public class LyambdaTest<T> {
    T t;

    public static void main(String[] args) {
        IntBinaryOperator operation = Integer::sum;
        System.out.println(operation);
    }

}
