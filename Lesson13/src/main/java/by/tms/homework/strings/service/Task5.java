package by.tms.homework.strings.service;

public class Task5 {
    //     * 5)Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака:
//     * Пример: "string" → "ri", "code" → "od", "Practice"→"ct".
    public static void main(String[] args) {
        String str = "String";
        String str2 = "Merchandise";
        System.out.println(getMiddleChars(str));
        System.out.println(getMiddleChars(str2));
    }

    public static String getMiddleChars(String string) {
        return string.substring(string.length() / 2 - 1, string.length() / 2 + 1);
    }
}
