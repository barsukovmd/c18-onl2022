package by.tms.model;
import java.util.Random;
import java.util.Scanner;

public class Computer {
    private final String Processor;
    private final String Operation;
    private final String HardDisk;
    private int ResourceOfCycles;
    private boolean burned;//false 0
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public Computer(String processor, String operation, String hardDisk, int resourceOfCycles) {
        Processor = processor;
        Operation = operation;
        HardDisk = hardDisk;
        ResourceOfCycles = resourceOfCycles;
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
        System.out.println("Please enter 0 or 1");
        int i = random.nextInt(2);
        if (i == randomValueFromConcole() && !burned && ResourceOfCycles > 0) {
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
        if (!burned && ResourceOfCycles > 0) {
            System.out.println("Выключение");
            System.out.println(" ResourceOfCycles " + --ResourceOfCycles);
            scanner.nextInt();
        } else {
            System.out.println("Компьютер сгорел");
        }
    }
}