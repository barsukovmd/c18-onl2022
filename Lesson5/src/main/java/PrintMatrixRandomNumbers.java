import java.util.Random;
import java.util.Scanner;

public class PrintMatrixRandomNumbers {
    /*
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void main(String[] args) {
        printMatrixNumbers();
    }

    private static void printMatrixNumbers() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of matrix");
        int a = scanner.nextInt();
        System.out.println("Enter width of matrix");
        int b = scanner.nextInt();
        char[][] ints = new char[a][b];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                ints[i][j] = (char) random.nextInt(100);
            }
        }
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[i][j] % 3 == 0) {
                    ints[i][j] = '+';
                } else if (ints[i][j] % 7 == 0) {
                    ints[i][j] = '-';
                } else {
                    ints[i][j] = '*';
                }
            }
        }
    }
    }
