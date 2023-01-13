import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

///**
// * Основное задание
// * 1. Написать программу для вывода на консоль названия дня недели по
// * введенной дате.
// */
public class Task1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 1, 12, 3, 28);
        System.out.println(localDateTime);
        System.out.println("Second option");
        String date = "2023-01-12";
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        System.out.println(localDate.format(dateTimeFormatter));
    }
}
