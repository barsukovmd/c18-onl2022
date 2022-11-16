import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        System.out.println("Enter positive number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (true) {
            if (getArray(x)) {
                break;
            } else {
                x = scanner.nextInt();
            }
        }
    }

    public static boolean getArray(int x) {
        if (x > 0 & x <= 1000) {
            System.out.println("You have entered positive number " + x);
            return true;
        } else if (x > 1000) {
            System.out.println("You have entered more than 1000, try again");
            return false;
        } else {
            System.out.println("You have entered negative number " + x + " try again");
            return false;
        }
    }
}


