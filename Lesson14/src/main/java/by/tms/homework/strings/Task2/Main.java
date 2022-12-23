package by.tms.homework.strings.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //      * По  регулярным выражениям!
//    * 2) Дана строка "cab, ccab, cccab" Необходимо составить регулярное выражение, сделать класс Pattern, Matcher, вызвать метод find и вывести слова на консоль
//    * Должно вывести:
//    * cab
//    * ccab
//    * cccab
//    *
    public static void main(String[] args) {
        String string = "cab, ccab, cccab";
        Pattern pattern = Pattern.compile("c.+ab");
        Matcher matcher = pattern.matcher("cab, ccab, cccab");
        while (matcher.find()) {
            System.out.println(string.substring(matcher.start(), matcher.end()));
        }
    }
}
