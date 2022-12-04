package homework9Task2;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString


public class Bouquet extends Flower {
    private Flower[] flowers;

    Bouquet(FlowerType flowerType, Flower[] flowers) {
        super(flowerType);
        this.flowers = flowers;
    }

    public int getPrice() {
        int pricePerFlower = 0;
        for (Flower allFlowers : flowers) {
            pricePerFlower += allFlowers.getFlowerType().getCost();
        }
        return pricePerFlower;
    }
}
