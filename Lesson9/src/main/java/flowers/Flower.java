package flowers;

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
