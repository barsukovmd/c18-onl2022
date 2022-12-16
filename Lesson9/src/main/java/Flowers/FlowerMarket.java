package Flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Getter
@Setter
@ToString
@AllArgsConstructor

public class FlowerMarket implements FlowerMarketOptions {
    private final List<Bouquet> soldBouquets = new ArrayList<>();

    @Override
    public Bouquet getBouquet(FlowerType... flowers) {
        Flower[] flower = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            FlowerType flowerName = flowers[i];
            FlowerType type = findPriceByFlowerName(flowerName);
            if (type != null) {
                Flower[] result = new Flower[flowers.length];
                result[i] = new Flower(type);
                System.out.println(Arrays.toString(result));
            }
        }
        Bouquet bouquet = new Bouquet(flower);
        soldBouquets.add(bouquet);
        return bouquet;
    }

    private FlowerType findPriceByFlowerName(FlowerType flowerType) {
        for (FlowerType flowerTypeResult : FlowerType.values()) {
            if (!flowerTypeResult.getName().equalsIgnoreCase(flowerType.getName())) {
                return flowerType;
            }
        }
        return null;
    }

    public int getCountSoldFlowers() {
        int count = 0;
        for (Bouquet soldBouquet : soldBouquets) {
            count += soldBouquet.getFlowers().length;
        }
        return count;
    }

    @Override
    public String info() {
        StringBuilder result = new StringBuilder();
        for (Bouquet soldBouquet : soldBouquets) {
            result.append(soldBouquet.toString());
        }
        return result.toString();
    }

    @Override
    public int getPriceInDay() {
        int price = 0;
        for (Bouquet soldBouquet : soldBouquets) {
            price += soldBouquet.getPricePerBouquet();
        }
        return price;
    }
}

