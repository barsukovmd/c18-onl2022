import java.util.Scanner;

public class CountModuleNumberScanner {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Введите второе число");
        int y = scanner.nextInt();
        System.out.println("Введите третье число");
        int z = scanner.nextInt();
        if (Math.abs(x) < Math.abs(y) && Math.abs(x) < Math.abs(z)) {
            System.out.println("Меньшее число по модулю " + Math.abs(x));
        } else if (Math.abs(y) < Math.abs(x) && Math.abs(y) < Math.abs(z)) {
            System.out.println("Меньшее число по модулю " + Math.abs(y));
        } else {
            System.out.println("Меньшее число по модулю " + Math.abs(z));
        }

    }
}
