package Flowers;

import java.util.Arrays;

import static Flowers.FlowerType.*;

public class Main {
    public static void main(String[] args) {
        FlowerMarketOptions flowerMarket = new FlowerMarket();
        Bouquet[] bouquets = {
                flowerMarket.getBouquet(ASTER, TULIP, CARNATION, GERBERA, ROSE),
                flowerMarket.getBouquet(ASTER, TULIP, ROSE),
                flowerMarket.getBouquet(ASTER, GERBERA, CARNATION),
                flowerMarket.getBouquet(ASTER, CARNATION, TULIP, ROSE)
        };
        String s = Arrays.toString(bouquets);
        System.out.println(s);
        int countSoldFlowers = flowerMarket.getCountSoldFlowers();
        int priceInDay = flowerMarket.getPriceInDay();
        String info = flowerMarket.info();
        System.out.println(info);
        System.out.println(priceInDay);
        System.out.println(countSoldFlowers);
    }
}
