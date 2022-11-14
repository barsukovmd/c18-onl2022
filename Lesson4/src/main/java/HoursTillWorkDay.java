import java.util.Random;

public class HoursTillWorkDay {
    public static void main(String[] args) {
        Random random = new Random();
        int sec = random.nextInt(28800);
        int hours = sec / 60 / 60;
        System.out.println("Секунд осталось " + sec);
        switch (hours) {
            case 0:
                System.out.println("До конца рабочего дня осталось меньше часа");
                break;
            case 1:
                System.out.println("До конца рабочего дня остался " + hours + " час");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("До конца рабочего дня осталось " + hours + " часа");
                break;
            default:
                System.out.println("До конца рабочего дня осталось " + hours + " часов");
        }
    }
}

