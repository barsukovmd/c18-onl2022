import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        char operation = 0;
        int result;
        System.out.println("Введите 2  целых числа и поставьте между ними знак вычисления: ");
        String userInput = scanner.nextLine();
        char[] variation = new char[10];
        for (int i = 0; i < userInput.length(); i++) {
            variation[i] = userInput.charAt(i);
            if (variation[i] == '+') {
                operation = '+';
            }
            if (variation[i] == '-') {
                operation = '-';
            }
            if (variation[i] == '*') {
                operation = '*';
            }
            if (variation[i] == '/') {
                operation = '/';
            }
        }

        try {
            String variationString = String.valueOf(variation);
            String[] splitOption = variationString.split("[+-/*]");
            String var0 = splitOption[0];
            String var1 = splitOption[1];
            String var3 = var1.trim();
            number1 = Integer.parseInt(var0);
            number2 = Integer.parseInt(var3);
            result = calculated(number1, number2, operation);
            System.out.println("Результат: " + number1 + " " + operation + " " + number2 + " = " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "ошибка, попробуйте еще раз");
        }
    }

    public static int calculated(int number1, int number2, char operation) {
        int result = 0;
        switch (operation) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> result = Math.ceilDiv(number1, number2);
            default -> throw new IllegalArgumentException("Неверный знак операции");
        }
        return result;
    }
}
