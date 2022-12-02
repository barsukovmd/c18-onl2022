package homework9Task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Getter

public class Flower {

    private String name;
    private int price;

    public Flower(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
