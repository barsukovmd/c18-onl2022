package by.tms.homework.strings.Task1;

public class Main {
    /*
     * По строкам дополнительная!
     *  1) Даны строки разной длины c четным числом символов(казаки, просмотреть и так далее),
     *  необходимо вернуть ее два средних знака.
     * Например, если дана строка "string"  результат будет "ri", для строки "code" результат "od",  для "Practice" результат "ct".
     */
    public static void main(String[] args) {
        System.out.println(getMiddleChars("String"));
        System.out.println(getMiddleChars("code"));
        System.out.println(getMiddleChars("Practice"));
    }

    public static String getMiddleChars(String string) {
        return string.substring(string.length() / 2 - 1, string.length() / 2 + 1);
    }

}
