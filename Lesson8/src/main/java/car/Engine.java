package car;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Engine {
    private Scanner scanner = new Scanner(System.in);
    private boolean isOn = true;
    private int resourceOfEngine = 1000;

    public void on() {
        if (isOn && resourceOfEngine > 0) {
            System.out.println("Car engine is turned on");
        } else {
            System.out.println("Please turn on your car engine");
        }
    }

    public boolean off() {
        if (!isOn) {
            System.out.println("Please turn off the engine");
        }
        return false;
    }

    public int checkResourceOfEngine(int resourceOfEngine) {
        for (int i = 0; i < 1000; i++) {
            resourceOfEngine--;
        }
        return resourceOfEngine;
    }

    public void rideTheCar() {
        if (off()) {
            System.out.println("Car should be turned on");
        } else {
            scanner.nextInt();
            System.out.println("Car is riding");
        }
    }
}
