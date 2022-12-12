package homework9Task2;

import java.util.Arrays;

import static homework9Task2.FlowerType.ROSE;

public class Main {
    public static void main(String[] args) {
        FlowerMarketOptions flowerMarket = new FlowerMarket();
        Bouquet[] bouquets = {
                flowerMarket.getBouquet(),
                flowerMarket.getBouquet(String.valueOf(ROSE)),
                flowerMarket.getBouquet(String.valueOf(ROSE)),
                flowerMarket.getBouquet(String.valueOf(ROSE))
        };
        System.out.println(Arrays.toString(bouquets));

    }
}
