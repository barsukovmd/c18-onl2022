package models;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class CarVIP implements CarCharacteristicImpl {
    public void getDistance() {
        System.out.println("Car 3 300km");
    }

    @Override
    public void getSpeed() {
        System.out.println("300 km/h");
    }

    @Override
    public void getInsurance() {
        System.out.println("5 years");
    }
}
