package by.tms.homework.test;

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
        boolean result = str3.regionMatches(6, str4, 2, 3);
//        Подскажите как правильно написать, чтобы было str4.ignoreCase??? в 49 строке
        System.out.println(result);
        System.out.println(str3.compareTo(str4));
        String s = "MY FAMILY AND HIS FAMILY";
        System.out.println(s.indexOf("A"));
        System.out.println(s.lastIndexOf("A"));
    }
}
