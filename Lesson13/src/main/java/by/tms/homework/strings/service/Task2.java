package by.tms.homework.strings.service;

public class Task2 {
    //     * 2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
    public static void main(String[] args) {
        System.out.println(replaceString("Hello, my name is Eugene"));
    }

    public static String replaceString(String string) {
        return string.replace(string.charAt(3), string.charAt(0));
    }
}
