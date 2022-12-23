package by.tms.homework.strings.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //    3) Дана строка "Versions: Java  5, Java 6, Java   7,
//    Java 8, Java 12."  Найти все подстроки "Java X", где X - число и распечатать их.
    public static void main(String[] args) {
        String string = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile("Java\\s+[0-9]+");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(string.substring(matcher.start(), matcher.end()));
        }
    }
}

