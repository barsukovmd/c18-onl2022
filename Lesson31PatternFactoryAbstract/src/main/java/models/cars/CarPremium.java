package models.cars;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class CarPremium extends CarCharacteristic {
    public void getDistance() {
        System.out.println("2000km");
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
