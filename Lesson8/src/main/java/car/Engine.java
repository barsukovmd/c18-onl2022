package car;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public final class Engine {
    private Scanner scanner = new Scanner(System.in);
    private boolean isOn;
    private int resourceOfEngine;

    public Engine(boolean isOn, int resourceOfEngine) {
        this.isOn = isOn;
        this.resourceOfEngine = resourceOfEngine;
    }

    public boolean isOn() {
        if (isOn && resourceOfEngine > 0) {
            scanner.next();
            System.out.println("Car engine is turned on");
            return false;
        } else {
            System.out.println("Please turn on your car engine");
        }
        return true;
    }

    public boolean isOff() {
        if (!isOn) {
            System.out.println("Please turn off the engine");
            return false;
        }
        return true;
    }

    public int checkResourceOfEngine(int resourceOfEngine) {
        for (int i = 0; i < 1000; i++) {
            resourceOfEngine--;
        }
        return resourceOfEngine;
    }

    public void rideTheCar() {
        if (isOff()) {
            System.out.println("Car should be turned on");
        } else {
            scanner.nextInt();
            System.out.println("Car is riding");
        }
    }
}
