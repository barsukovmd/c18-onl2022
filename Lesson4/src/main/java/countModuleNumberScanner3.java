import java.util.Scanner;

public class countModuleNumberScanner3 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("Введите второе число");
        y = scanner.nextInt();
        System.out.println("Введите третье число");
        z = scanner.nextInt();
        if (Math.abs(x) < Math.abs(y) && Math.abs(x) < Math.abs(z)) {
            System.out.println("Меньшее число по модулю " + Math.abs(x));

        } else if (Math.abs(y) < Math.abs(x) && Math.abs(y) < Math.abs(z)) {
            System.out.println("Меньшее число по модулю " + Math.abs(y));

        } else {
            System.out.println("Меньшее число по модулю " + Math.abs(z));
        }

    }
}
