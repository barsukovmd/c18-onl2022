package models;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Car3 implements CarCharacteristicImpl {
    public void getDistance() {
        System.out.println("Car 3 300km");
    }
}
