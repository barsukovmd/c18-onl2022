package by.tms.homework.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//* Пишем все в ООП стиле. Создаем класс TextFormatter
////     * в котором два метода:
////     * 1. Метод принимает строку и возвращает кол-во слов в строке.
////     * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
////     *
public class TextFormatter {

    public static int getCountWordsInString(String string) {
        return identifyWords(string).size();
    }

    public static List<String> getSentencesFromText(String text) {
        List<String> originalSentences = Arrays.asList(text.split("[!.?]\\s*"));
        List<String> result = new ArrayList<>();
        for (String sentence : originalSentences) {
            String replacedSentence = sentence.replaceAll("-*\n+", "");
            result.add(replacedSentence);
        }
        return result;
    }

    public static List<String> getPalindromes(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (isPalindrome(string)) {
                result.add(string);
            }
        }
        return result;
    }

    public static boolean hasPalindromeInString(String string) {
        for (String word : identifyWords(string)) {
            if (isPalindrome(word)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasBlacklistWordInString(String string, String[] blacklist) {
        for (String blWord : blacklist) {
            if (string.contains(blWord)) {
                return true;
            }
        }
        return false;
    }

    private static List<String> identifyWords(String string) {
        return Arrays.asList(string.split(" "));
    }

    private static boolean isPalindrome(String string) {
        if (string.length() < 2) {
            return false;
        }
        StringBuilder sb = new StringBuilder(string);
        return string.equalsIgnoreCase(sb.reverse().toString());
    }

}
