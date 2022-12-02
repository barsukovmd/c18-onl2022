package homework9Task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Getter

public class Flower {
    private FlowerType flowerType;
    private String name;

    public Flower(FlowerType flowerType, String name, int price) {
        this.flowerType = flowerType;
        this.name = name;
        this.flowerType.cost = price;
    }
}
