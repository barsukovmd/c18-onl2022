package calculator;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculatorMain {

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
        String variationString = String.valueOf(variation);
        String[] splitOption = variationString.split("[+-/*]");
        String var0 = splitOption[0];
        String var1 = splitOption[1];
        String var3 = var1.trim();
//        number1 = romanToGreekNumber(var0);
//        number2 = romanToGreekNumber(var3);

//        if (number1 < 0 && number2 < 0) {
//            result = 0;
//        } else {
//            result = calculated(number1, number2, operation);
//            System.out.println("Операция для римских цифр");
////            String resultRoman = convertNumberToRoman(result);
//            System.out.println(var0 + " " + operation + " " + var3 + " = " + resultRoman);
//        }
        number1 = Integer.parseInt(var0);
        number2 = Integer.parseInt(var3);
        result = calculated(number1, number2, operation);
        System.out.println("Операция для арабских цифр");
        System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
    }

//    static String convertNumberToRoman(int numberArabian) {
//        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
//        };
//        return roman[numberArabian];
//    }

    public static int calculated(int number1, int number2, char operation) {
        int result = 0;
        switch (operation) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
                try {
                    result = number1 / number2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("Exception : " + e);
                }
            }
            default -> throw new IllegalArgumentException("Неверный знак операции");
        }
        return result;
    }
//
//    static int romanToGreekNumber(String roman) {
//        try {
//            switch (roman) {
//                case "I" -> {
//                    return 1;
//                }
//                case "II" -> {
//                    return 2;
//                }
//                case "III" -> {
//                    return 3;
//                }
//                case "IV" -> {
//                    return 4;
//                }
//                case "V" -> {
//                    return 5;
//                }
//                case "VI" -> {
//                    return 6;
//                }
//                case "VII" -> {
//                    return 7;
//                }
//                case "VIII" -> {
//                    return 8;
//                }
//                case "IX" -> {
//                    return 9;
//                }
//                case "X" -> {
//                    return 10;
//                }
//            }
//        } catch (InputMismatchException e) {
//            throw new InputMismatchException("Данные введены неправильно");
//        }
//        return -1;
//    }
}
