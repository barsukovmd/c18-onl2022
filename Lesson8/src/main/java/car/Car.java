package car;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Car {
    private FuelTank fuelTank;
    private Engine engine;

    public Car(FuelTank fuelTank, Engine engine) {
        this.fuelTank = fuelTank;
        this.engine = engine;
    }
}
