package by.tms.homework.strings.service;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    //     * 3) В массиве находятся слова. Вывести на экран слова палиндромы
//     * (т.е которые читаются справа на лево и слева на право одинаково, например: заказ, казак, дед...)
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Казак");
        strings.add("Дед");
        strings.add("Заказ");
        strings.add("Поселок");
        strings.add("Вертолет");
        strings.add("Учу");
        strings.add("Водородов");
        System.out.println(showPalindromes(strings));
    }

    public static List<String> showPalindromes(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String stringPalindrome : strings) {
            if (stringPalindrome.equalsIgnoreCase(StringUtils.reverse(stringPalindrome))) {
                result.add(stringPalindrome);
            }
        }
        return result;
    }
}
