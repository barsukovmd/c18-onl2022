package homework9Task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString


public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public int getPrice(FlowerType flowerType) {
        int pricePerFlower = flowerType.getCost();
        for (Flower allFlowers : flowers) {
            pricePerFlower += allFlowers.getFlowerType().getCost();
        }
        return pricePerFlower;
    }
}
