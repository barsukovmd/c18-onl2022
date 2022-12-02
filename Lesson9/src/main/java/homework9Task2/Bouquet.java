package homework9Task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bouquet {
    Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public int getPrice(FlowerType flowerType) {
        int price = 0;
        for (Flower allFlowers : flowers) {
            price += allFlowers.getPrice();
        }
        return price;
    }

}
