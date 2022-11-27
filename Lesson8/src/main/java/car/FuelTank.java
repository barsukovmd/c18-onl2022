package car;

import lombok.Getter;

@Getter
public class FuelTank {
    private int fuel = 50;

    public FuelTank(int fuel) {
        this.fuel = fuel;
    }

    public void checkFuel(int fuel) {
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
