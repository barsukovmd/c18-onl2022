package test;

import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    public static class Utils {
        public static <T> T getValue(Object obj, Class<T> tClass) {
            return (T) obj;
        }

        public static <T> T getValue(Object obj) {
            return (T) obj;
        }

        public static <T> T getValue(Integer integer) {
            return (T) integer;
        }
    }

    public static void main(String[] args) {
        List list = Arrays.asList("Author", "Book");
        for (Object element : list) {
            String data = Utils.getValue(element, String.class);
            System.out.println(data);
            System.out.println(Utils.<String>getValue(element));
        }
        List integers = Arrays.asList(2, 3, 54, 5);
        for (Object integer : integers) {
            System.out.println(Utils.<Integer>getValue(integer) + 1);
        }
    }

}
