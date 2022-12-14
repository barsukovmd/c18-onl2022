package homework9Task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor

public class Bouquet {
    private Flower[] flowers;

    public int getPricePerBouquet() {
        int pricePerBouquet = 0;
        for (Flower allFlowers : flowers) {
            if (allFlowers != null) {
                pricePerBouquet += allFlowers.getFlowerType().getPrice();
            }
        }
        return pricePerBouquet;
    }

    public void deleteFlower(String... getFlowerBack) {
        for (String deleteFlowers : getFlowerBack) {
            for (int i = 0; i < flowers.length; i++) {
                if (flowers[i] != null && deleteFlowers.equalsIgnoreCase(flowers[i].getFlowerType().getName())) {
                    flowers[i] = null;
                    break;
                }
            }
        }
    }
}
