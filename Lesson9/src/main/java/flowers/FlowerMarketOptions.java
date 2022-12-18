package flowers;

public interface FlowerMarketOptions {
    int getCountSoldFlowers();

    String info();

    int getPriceInDay();

    Bouquet getBouquet(FlowerType... flowers);
}

