import java.util.Scanner;

public class CountDevs {
    public static void main(String[] args) {
        System.out.println("Enter number of DevOps");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        getCountDevs(x);
    }

    public static void getCountDevs(int x) {
        if (x < 5 & x % 2 == 0 & x % 3 == 0) {
            System.out.println(x + " программиста");
        } else if (x >= 5 | x % 2 == 0 | x % 3 == 0 | x % 5 == 0) {
            System.out.println(x + " программистов");
        } else {
            System.out.println(x + " программист");
        }
    }
}




/*
 * На вход приходит число.
 * Вывести в консоль фразу из разряда "_COUNT_ программистов",
 * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
 * уместное с точки зрения русского языка.
 * Пример: 1 программист, 42 программиста, 50 программистов
 *
 * @param count - количество программистов
 */

