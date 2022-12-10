package homework9Task2;

public class Main {
    public static void main(String[] args) {
        FlowerMarketOptions flowerMarket = new FlowerMarket();
        Bouquet[] bouquets = {
                flowerMarket.getBouquet(ROSE, TULIP, ASTER, CARNATION)
                flowerMarket.getBouquet(ROSE, LILY, GERBERA, ASTER, CARNATION)
                flowerMarket.getBouquet(ROSE, TULIP, LILY, ASTER, CARNATION)
                flowerMarket.getBouquet(ROSE, TULIP, LILY, ASTER, CARNATION)
        };
    }
}
