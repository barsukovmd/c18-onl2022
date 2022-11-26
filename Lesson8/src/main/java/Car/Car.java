package Car;

import java.util.Scanner;

public class Car {
    private Car car;
    private FuelTank fuelTank;
    private Engine engine;
    private boolean isFixTheCar = true;
    private Milage milage;
    private Scanner scanner = new Scanner(System.in);

    public class Milage {
    }

    public class Engine {
        public void on() {
            if (scanner.hasNextInt()) {
                System.out.println("Car engine is turned on");
            } else {
                System.out.println("Please turn on your car engine");
                scanner.nextInt();
            }
        }
    }

    public class FuelTank {
        public void notEnoughFuel() {
            int fuel = 50;
            for (int i = 0; i < fuel; i++) {
                fuel--;
            }
            if (fuel < 0) {
                System.out.println("Car should be refilled");
            } else {
                System.out.println("You can drive the car");
            }
        }
    }
}
