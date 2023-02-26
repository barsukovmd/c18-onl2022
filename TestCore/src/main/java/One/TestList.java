package One;

import java.util.*;

public class TestList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("dgfaffgsq");
        strings.add("khhhb");
        strings.add("sdcaafd");
        strings.stream()
                .map(s -> Arrays.stream(s.split("")).distinct().count())
                .forEach(System.out::println);
    }
}
