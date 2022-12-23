package by.tms.homework.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        char[] hello = string.toCharArray();
        System.out.println(hello);
        System.out.println("!!!");
        System.out.println(string);
        System.out.println(string.charAt(3));
        System.out.println(string.length());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
        String s1 = "WorldHello";
        String s2 = "             Hello ";
        String s3 = "HelloWorld";

        System.out.println(s1.concat(" " + s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.lastIndexOf(s2));
        System.out.println(s2.trim());
        System.out.println(s3.startsWith(s2));//сначала указываем строку, потом указываем подстроку
        System.out.println(s1.endsWith(s2));
        System.out.println(s3.replace("World", "WorldWide"));

        System.out.println(s1.substring(4, 8));//обрезает и возвращает определенную (нужную нам подстроку)
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        String s4 = "Welcome";
        String s5 = "My Friend";
        System.out.println(s4.concat(s5));
        String s6 = String.join(" ", s4, s5);
        System.out.println(s6);
        System.out.println("!!!!!!!!!!");
        String str = "Welcome Home";
        int start = 8;
        int end = 12;
        char[] dst = new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst);

        String str1 = "Hello My World";
        String str2 = "hello my world";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String str3 = "Hello World";
        String str4 = "I Work";
        System.out.println("sd".regionMatches(true, 6, str4, 2, 3));
        System.out.println(str3.compareTo(str4));
        String s = "MY FAMILY AND HIS FAMILY";
        System.out.println(s.indexOf("A"));
        System.out.println(s.lastIndexOf("A"));
        boolean checkStart = str3.startsWith("He");
        boolean checkEnd = str3.endsWith("rld");
        System.out.println(checkStart);
        System.out.println(checkEnd);
        String replace = str3.replace("Hello", "Bye");
        System.out.println(replace);
        String substring = str2.substring(5);
        System.out.println(substring);
        System.out.println("!");
        System.out.println("!");
        System.out.println("!");
        System.out.println("!");
        System.out.println("!");
        String string1 = "My name is Eugene, and I am working as a Java Developer";
        String[] strings = string1.split(" ");
        for (String string2 : strings) {
            System.out.println(string2);
        }

        String string2 = "Cat";
        String string3 = "Cat";
        System.out.println(string2);
        System.out.println(string3);

        String s7 = "Алла Александр Юлия Мария";
        Pattern pattern = Pattern.compile("А.+а");
        Matcher matcher = pattern.matcher("Алла");
        while (matcher.find()) {
            int start1 = matcher.start();
            int end1 = matcher.end();
        }
        System.out.println("");
    }
}
