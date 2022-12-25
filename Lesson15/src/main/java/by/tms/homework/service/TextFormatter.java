package by.tms.homework.service;

import org.apache.commons.lang3.StringUtils;

//* Пишем все в ООП стиле. Создаем класс TextFormatter
////     * в котором два метода:
////     * 1. Метод принимает строку и возвращает кол-во слов в строке.
////     * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
////     *
public class TextFormatter {
    public static String[] splitSentencesByDot(String string) {
        return string.split("\\.");
    }

    public static int countWordsInString(String string) {
        int count = 0;
        String[] strings = string.split(" ");
        for (String word : strings) {
            count++;
        }
        return count;
    }

    public static boolean checkWordLength(String string) {
        return string.length() >= 3 && string.length() <= 5;
    }


    public static boolean checkPalindromes(String string) {
        String[] strings = splitSentencesByDot(string);
        for (String palindrome : strings) {
            palindrome.split(" ");
            if (palindrome.equalsIgnoreCase(StringUtils.reverse(palindrome))) {
                return true;
            }
        }
        return false;
    }
}
