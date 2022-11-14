import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        System.out.println("Enter positive number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        getArray(x);
    }

    public static void getArray(int x) { //не знаю как сделать с void, выводит ошибку getArray()
        if (x > 0 & x <= 1000) {
            System.out.println("You have entered positive number " + x);
        } else if (x > 1000) {
            System.out.println("You have entered more than 1000, try again");
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();
        } else {
            System.out.println("You have entered negative number " + x + " try again");
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();
        }
    }
}

/*
 * Необходимо прочитать с консоли значение числа типа int,
 * сделать проверку, что если пользователь ввел не положительное число,
 * то вывести ошибку и отправить пользователя вводить заново новое число!
 * далее создать одномерный массив типа int размера прочитанного с консоли
 * далее заполнить массив случайными значениями
 * далее вывести массив на консоль
 */