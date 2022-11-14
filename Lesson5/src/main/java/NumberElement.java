import java.util.Scanner;

public class NumberElement {
    public static void main(String[] args) {
        System.out.println("Enter digit");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        countDigits(number);
    }

    public static void countDigits(int number) {
        int quantity = 0;
        for (int i = 1; number / i >= 1; i *= 10) {
            quantity++;
        }
        System.out.println(quantity + " elements in number");
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }
}

//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, введите число: 5
//        "5 - это положительное число, количество цифр = 1"