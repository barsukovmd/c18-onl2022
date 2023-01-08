import java.util.Scanner;

import static java.time.DayOfWeek.*;

/**
 * Основное задание
 * 1. Написать программу для вывода на консоль названия дня недели по
 * введенной дате.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter number of weekday");
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        switch (dayNumber) {
            case 1 -> System.out.println(MONDAY);
            case 2 -> System.out.println(TUESDAY);
            case 3 -> System.out.println(WEDNESDAY);
            case 4 -> System.out.println(THURSDAY);
            case 5 -> System.out.println(FRIDAY);
            case 6 -> System.out.println(SATURDAY);
            case 7 -> System.out.println(SUNDAY);
            case 8 -> System.out.println("There are only 7 days in week");
        }
    }
}
