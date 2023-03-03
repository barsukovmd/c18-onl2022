package models;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Car1 implements CarCharacteristicImpl {
    public void getDistance() {
        System.out.println("Car 1 100km");
    }
}
