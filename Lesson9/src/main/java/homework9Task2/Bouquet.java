package homework9Task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bouquet extends Flower {
    Flower[] flowers;

    public Bouquet(String name, int price, Flower[] flowers) {
        super(name, price);
        this.flowers = flowers;
    }

    public int getPrice() {
        int price = 0;
        for (Flower allFlowers : flowers) {
            price += allFlowers.getPrice();
        }
        return price;
    }

}
