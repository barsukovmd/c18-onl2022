package by.tms.homework.service.exercise4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class Car implements Serializable {
    private String brand;
    private int maxSpeed;
    private int price;

    public Car(String brand, int maxSpeed, int price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public Car() {
    }
}
