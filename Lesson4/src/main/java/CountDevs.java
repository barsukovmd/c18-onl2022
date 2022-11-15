import java.util.Scanner;

public class CountDevs { //нужно ли вам оставлять задание вверху, чтобы видели? или удалять?
    public static void main(String[] args) {
        System.out.println("Enter number of DevOps");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        countNumberOfDevs(x);
    }

    public static void countNumberOfDevs(int x) {
        int d10 = x % 10;
        int d100 = x % 100;
        if (d10 > 1 && d10 < 5 || d100 > 12) {
            System.out.println(x + " программиста");
        } else if (d10 > 4 || d10 == 0) {
            System.out.println(x + " программистов");
        } else {
            System.out.println(x + " программист");
        }
    }
}






