import java.util.Scanner;

public class CountDevs {
    public static void main(String[] args) {
        System.out.println("Enter number of DevOps");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        countNumberOfDevs(x);
        for (int i = 0; i < 1000; i++) {
            countNumberOfDevs(i);

        }
    }

    public static void countNumberOfDevs(int x) {
        int d10 = x % 10;
        int d100 = x % 100;
        if (d10 == 1 && d100 != 11) {
            System.out.println(x + " программист");
        } else if ((d10 >= 2 && d10 <= 4) && !(d100 >= 12 && d100 < 14)) {
            System.out.println(x + " программиста");
        } else {
            System.out.println(x + " программистов");
        }
    }
}






