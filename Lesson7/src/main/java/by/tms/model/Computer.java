package by.tms.model;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;

@Setter
@Getter
public class Computer {
    private String Processor;
    private String Operation;
    private String HardDisk;
    private String ResourceOfCycles; //(включился выключился - один цикл)

    public Computer(String processor, String operation, String hardDisk, String resourceOfCycles) {
        Processor = processor;
        Operation = operation;
        HardDisk = hardDisk;
        ResourceOfCycles = resourceOfCycles;
    }

    public void on() {
        System.out.println("Please enter 0 or 1");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int on = scanner.nextInt();
        int i = random.nextInt(2);
        if (i == on) {
            System.out.println("Компьютер выключился");
        } else if (on != i) {
            System.out.println("компьютер сгорает");
            scanner.nextInt();
        }
        if (on != i) {
            System.out.println("Компьютер сгорел");
        }
    }

    public void off() {

    }
}
