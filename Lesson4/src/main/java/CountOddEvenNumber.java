import java.util.Scanner;

public class CountOddEvenNumber {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("Вы ввели целое число ");
        } else {
            System.out.println("Ошибка, вы ввели нецелое число");
        }
    }
}

