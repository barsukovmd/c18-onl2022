package One;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class TestList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("udhbfvvvvvvvvvvvvv");//переход значения "слово" -> к значению буква
        strings.add("khhhb");//переход значения "слово" -> к значению буква
        strings.add("sdcaafd");//переход значения "слово" -> к значению буква
        strings.stream()
                .map(s -> Arrays.stream(s.split("")).distinct().count())
                .forEach(System.out::println);
    }
}
