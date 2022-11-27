package car;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Car {
    private Scanner scanner = new Scanner(System.in);
    private FuelTank fuelTank;
    private Engine engine;

    public Car(FuelTank fuelTank, Engine engine) {
        this.fuelTank = fuelTank;
        this.engine = engine;
    }
}
