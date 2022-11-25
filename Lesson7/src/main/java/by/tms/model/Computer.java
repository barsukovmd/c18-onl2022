package by.tms.model;
import java.util.Random;
import java.util.Scanner;

public class Computer {
    private final String processor;
    private final String operation;
    private final String hardDisk;
    private int resourceOfCycles;
    private final boolean burned = false;
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    public Computer(String processor, String operation, String hardDisk, int resourceOfCycles) {
        this.processor = processor;
        this.operation = operation;
        this.hardDisk = hardDisk;
        this.resourceOfCycles = resourceOfCycles;
        System.out.println(processor + " processor " + operation + " operation " + hardDisk + " hardDisk " + resourceOfCycles + " resourceOfCycles");
    }

    private int randomValueFromConcole() {
        int randomScanner = 0;
        do {
            if (scanner.hasNext()) {
                randomScanner = scanner.nextInt();
            } else {
                System.out.println("You have entered wrong number, please try again");
                scanner.nextInt();
            }
        } while (randomScanner < 0);
        return randomScanner;
    }

    public void on() {
        if (!burned && resourceOfCycles > 0) {
            System.out.println("Please enter 0 or 1");
        }
        int i = random.nextInt(2);
        if (i == randomValueFromConcole() && !burned && resourceOfCycles > 0) {
            System.out.println("Компьютер включился");
        } else if (i != randomValueFromConcole()) {
            System.out.println("компьютер сгорает");
            scanner.nextInt();
        }
        if (burned) {
            System.out.println("Компьютер сгорел");
        } else {
            off();
        }
    }

    public void off() {
        if (!burned && resourceOfCycles > 0) {
            System.out.println("Выключение");
            System.out.println(" ResourceOfCycles " + --resourceOfCycles);
            scanner.nextInt();
        } else {
            System.out.println("Компьютер сгорел");
        }
    }
}