package test;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("Hello world");
        String text = data.get(0);
        System.out.println(text);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(123);
        numbers.add(123);
        int size = numbers.size();
        System.out.println(size);
    }
}
