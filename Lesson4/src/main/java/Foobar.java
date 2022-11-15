import java.util.Scanner;

public class Foobar {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        getFoobar(x);
    }

    public static void getFoobar(int x) {
        if (x % 3 == 0 & x % 5 != 0) {
            System.out.println("foo");
        } else if (x % 5 == 0 & x % 3 != 0) {
            System.out.println("bar");
        } else if (x % 3 == 0 & x % 5 == 0) {
            System.out.println("foobar");
        } else {
            System.out.println("Enter appropriate number");
            Scanner scanner = new Scanner(System.in);
            scanner.next();
        }
    }
}







/*
 * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
 * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
 * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
 * - если остаток от деления на 3 и 5 равен нулю 0,то вывести "foobar" (example of number - 15)
 */