package homework9Task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Getter

public class Flower {
    private FlowerType flowerType;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }
}
