package models;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class CarBasic extends CarCharacteristic {

    @Override
    public void getDistance() {
        super.getDistance();
    }

    @Override
    public void getSpeed() {
        System.out.println("Speed 200km/h");
    }

    @Override
    void getInsurance() {
        System.out.println("2 years");
    }
}
