package models;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class CarBasic implements CarCharacteristicImpl {
    public void getDistance() {
        System.out.println("Car 1 100km");
    }

    @Override
    public void getSpeed() {

    }

    @Override
    public void getInsurance() {

    }
}
