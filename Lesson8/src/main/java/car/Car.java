package car;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Car {
    private FuelTank fuelTank;
    private Engine engine;
    private Mileage mileage;
    private String carBrand;
    private int carYear;
    private int checkMileage;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Car(FuelTank fuelTank, Engine engine) {
        this.fuelTank = fuelTank;
        this.engine = engine;
    }

    public Car(String carBrand, int carYear) {
        this.carBrand = carBrand;
        this.carYear = carYear;
    }

    public int checkDistance(int checkMileage) {

        if (checkMileage > 0 && engine.isOn() && !engine.isOff()) {
            for (int i = 0; i < checkMileage; i++) {
                checkMileage--;
            }
        }
        return checkMileage;
    }
}
