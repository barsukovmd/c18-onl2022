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
    private FlowerType flowerType;

    public Flower(String name, int price, FlowerType flowerType) {
        this.name = name;
        this.price = price;
        this.flowerType = flowerType;
    }
}
