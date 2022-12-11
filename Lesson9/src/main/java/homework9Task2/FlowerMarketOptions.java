package homework9Task2;

public interface FlowerMarketOptions {
    int getCountSoldFlowers();

    String info();

    int getPriceInDay();

    Bouquet getBouquet(String... flowers);
}

