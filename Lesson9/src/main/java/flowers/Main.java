package flowers;

import static flowers.FlowerType.*;

public class Main {
    public static void main(String[] args) {
        FlowerMarketOptions flowerMarket = new FlowerMarket();
        Bouquet[] bouquets = {
                flowerMarket.getBouquet(ASTER, TULIP, CARNATION, GERBERA, ROSE),
                flowerMarket.getBouquet(ASTER, TULIP, ROSE),
                flowerMarket.getBouquet(ASTER, GERBERA, CARNATION),
                flowerMarket.getBouquet(ASTER, CARNATION, TULIP, ROSE)
        };
        for (Bouquet bouquet : bouquets) {
            int pricePerBouquet = bouquet.getPricePerBouquet();
            System.out.println(pricePerBouquet);
        }
        System.out.println("!!!");
        int countSoldFlowers = flowerMarket.getCountSoldFlowers();
        int priceInDay = flowerMarket.getPriceInDay();
        String info = flowerMarket.info();
        System.out.println(info);
        System.out.println(priceInDay);
        System.out.println(countSoldFlowers);
    }
}
