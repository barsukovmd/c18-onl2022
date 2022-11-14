import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int y = operation(number);
        System.out.println(y);
    }

    public static int operation(int number) {
        if (number > 0) {
            return number + 1;
        } else if (number < 0) {
            return number - 2;
        } else if (number == 0) {
            return number + 10;
        }
        return number;
    }
}
/*
 * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
 * - if number положительное число, то необходимо number увеличить на 1
 * - if number отрицательное - уменьшить на 2
 * - if number равно 0, то замените значение number на 10
 * вернуть number после выполнения операций
 */