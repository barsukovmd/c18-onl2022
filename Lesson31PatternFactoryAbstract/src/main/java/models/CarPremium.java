package models;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class CarPremium implements CarCharacteristicImpl {
    public void getDistance() {
        System.out.println("Car 2 200km");
    }

    @Override
    public void getSpeed() {
        System.out.println("Speed 220 km/h");
    }

    @Override
    public void getInsurance() {
        System.out.println("5 years");
    }
}
