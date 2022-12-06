package homework9Task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Getter

public class Flower {
    private final String name;
    private FlowerType flowerType;

    public Flower(String name, FlowerType flowerType) {
        this.name = name;
        this.flowerType = flowerType;
    }
}
