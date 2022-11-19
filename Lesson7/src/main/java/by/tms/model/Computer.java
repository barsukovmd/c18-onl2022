package by.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String Processor;
    String Operation;
    String HardDisk;
    String ResourceOfCycles; //(включился выключился это один цикл)

    public void showAllStrings() {
    }

    public void on() {
        System.out.println("Please enter 0 or 1");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int on = scanner.nextInt();
        int i = random.nextInt(1);
        if (on == i) {
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
