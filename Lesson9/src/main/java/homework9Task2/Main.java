package homework9Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FlowerMarketOptions flowerMarket = new FlowerMarket();
        Bouquet[] bouquets = {
                flowerMarket.getBouquet()

        };
        System.out.println(Arrays.toString(bouquets));
    }
}
