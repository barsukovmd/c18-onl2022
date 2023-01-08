import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.util.Calendar.JANUARY;

public class Task2 {
    //     * 2. Написать программу для вывода на экран дату следующего вторника.
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2023, JANUARY, 7, 3, 40, 15);
        Date date = calendar.getTime();
        System.out.println(date + " date today");
        calendar.set(Calendar.HOUR, 3);
        calendar.set(Calendar.MINUTE, 40);
        calendar.set(Calendar.SECOND, 15);
        calendar.set(Calendar.DAY_OF_WEEK, 7);
        calendar.add(Calendar.DAY_OF_WEEK, +3);
        System.out.println(calendar.getTime() + " predictable date");
    }
//        calendar.add(Calendar.DAY_OF_WEEK, +number);//roll затрагивает только то значение, к которому обращаемся
//        System.out.println(calendar.getTime() + " predictable date");
}

