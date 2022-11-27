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
    private String carBrand;
    private int carYear;
    private int checkMileage;

    public Car(FuelTank fuelTank, Engine engine) {
        this.fuelTank = fuelTank;
        this.engine = engine;
    }

    public int checkDistance(int checkMileage) {
        if (checkMileage > 0) {
            for (int i = 0; i < checkMileage; i++) {
                checkMileage--;
            }
        }
        return checkMileage;
    }

}
