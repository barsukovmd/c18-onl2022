import java.util.Scanner;

public class countOddEvenNumber2 {
    public static void main(String[] args) {
        int x;

        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        if (x % 2 == 0) {

            System.out.println("Вы ввели целое число ");

        } else {

            System.out.println("Ошибка, вы ввели нецелое число");

        }

    }
}

