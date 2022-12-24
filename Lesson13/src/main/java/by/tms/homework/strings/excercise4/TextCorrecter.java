package by.tms.homework.strings.excercise4;

import lombok.Getter;

@Getter
public abstract class TextCorrecter {
    public static String[] splitSentencesByPoint(String string) {
        return string.split("\\.");
    }

    public static boolean checkForWordsAndPalindromes(String[] strings) {
        for (String palindrome : strings) {
            if (strings.length >= 3 && strings.length <= 5 || palindrome.equalsIgnoreCase(new StringBuilder(palindrome).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
