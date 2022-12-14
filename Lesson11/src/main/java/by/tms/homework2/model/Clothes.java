package by.tms.homework2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

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
