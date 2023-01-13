import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.DayOfWeek.TUESDAY;

public class Task2 {
    //     * 2. Написать программу для вывода на экран дату следующего вторника.
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime + " today");
        System.out.println(localDateTime.plusDays(+5) + " next tuesday");
        System.out.println("Second option");
        LocalDate localDate = LocalDate.now();
        LocalDate nextTuesday = localDate.with(TUESDAY);
        System.out.println(nextTuesday + " next tuesday");
    }
}

