package models.cars;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class CarVIP extends CarCharacteristic {
    public void getDistance() {
        System.out.println("8000km");
    }

    @Override
    public void getSpeed() {
        System.out.println("350 km/h");
    }

    @Override
    public void getInsurance() {
        System.out.println("5 years");
    }
}
