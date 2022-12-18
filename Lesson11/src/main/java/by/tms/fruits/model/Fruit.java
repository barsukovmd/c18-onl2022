package by.tms.fruits.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@Getter
@Setter
@ToString

public abstract class Fruit {
    List<Fruit> fruits;
    private final double weight;
    private double pricePerPound;

    public final void printManufacturerInfo() {
        System.out.print(" Made in Belarus ");
    }

    public double getPrice() {
        return pricePerPound *= weight;
    }

    public abstract Type getType();
}
