package by.tms.clothes.model;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder

@Getter
@ToString
public abstract class Clothes {
    public Clothes(int size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    private int size;
    private int price;
    private String color;
}
