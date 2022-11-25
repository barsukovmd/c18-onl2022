import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//0. Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).
public class Massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int console = scanner.nextInt();
        Random random = new Random();
        int[] ints = new int[10];
        boolean numbers = checkNumber(console, ints, random);
        System.out.println(numbers ? "number is in array" : "number not in array");
        // не получается вывести на экран весь массив чисел после
        // совпадения, понимаю, что из-за return

        System.out.println(Arrays.toString(ints));
    }

    private static boolean checkNumber(int console, int[] ints, Random random) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
            if (ints[i] == console) {
                return true;
            }
        }
        return false;
    }
}
