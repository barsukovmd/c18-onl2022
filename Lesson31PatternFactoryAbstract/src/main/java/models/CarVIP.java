package models;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class CarVIP implements CarCharacteristicImpl {
    public void getDistance() {
        System.out.println("Car 3 300km");
    }
}
