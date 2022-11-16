import java.util.Scanner;

public class BirthdayCounter {
    public static void main(String[] args) {
        System.out.println("Enter the month of your birthday");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println("Enter the date of your birthday");
        int date = scanner.nextInt();
        getZodiacSign(month, date);
    }

    public static void getZodiacSign(int month, int date) {
        if (month == 12 && date >= 23 || month == 1 && date <= 20) { //Козерог (23 декабря — 20 января)
            System.out.println("Capricorn");
        } else if (month == 1 && date >= 21 || month == 2 && date <= 19) {  //Водолей (21 января — 19 февраля)
            System.out.println("Aquarius");
        } else if (month == 2 && date >= 20 || month == 3 && date <= 20) {  //Рыбы (20 февраля — 20 марта)
            System.out.println("Pisces");
        } else if (month == 3 && date >= 21 || month == 4 && date <= 20) {  //Овен (21 марта – 20 апреля)
            System.out.println("Aries");
        } else if (month == 4 && date >= 21 || month == 5 && date <= 21) {  //Телец (21 апреля – 21 мая)
            System.out.println("Taurus");
        } else if (month == 5 && date >= 22 || month == 6 && date <= 21) {  //Близнецы (22 мая – 21 июня)
            System.out.println("Gemini");
        } else if (month == 6 && date >= 22 || month == 7 && date <= 22) {  // Рак (22 июня – 22 июля)
            System.out.println("Cancer");
        } else if (month == 7 && date >= 23 || month == 8 && date <= 21) {  //Лев (23 июля – 21 августа)
            System.out.println("Leo");
        } else if (month == 8 && date >= 22 || month == 9 && date <= 23) {  //Дева (22 августа – 23 сентября)
            System.out.println("Virgo");
        } else if (month == 9 && date >= 24 || month == 10 && date <= 23) {  //Весы (24 сентября – 23 октября)
            System.out.println("Libra");
        } else if (month == 10 && date >= 24 || month == 11 && date <= 23) {  //Скорпион (24 октября – 23 ноября)
            System.out.println("Scorpio");
        } else if (month == 11 && date >= 23 || month == 12 && date <= 22) {  //Стрелец (23 ноября — 22 декабря)
            System.out.println("Sagittarius");
        }
    }
}