package homework9Task2;

public class FlowerMarket extends Bouquet {
    public FlowerMarket(Flower[] flowers) {
        super(flowers);
    }
//    * Создать класс FlowerMarket, который содержит метод public Bouquet getBouquet(String... flowers),
// * Создать enum FlowerType c константами названия цветов.
// * Для создания букета в метод getBouquet нужно передавать константы через запятую(ROSE, ROSE, ROSE, ROSE, ROSE)
//                * По названию константы enam создать объект класса Flower и поместить в массив,
// * для передачи его в класс букета.

    public Bouquet getBouquet(String flower) {//как импортировать пакет, чтобы писать только КОНСТАНТЫ?
        // пытаюсь понять как их писать через запятую

//        FlowerType.ASTER, FlowerType.TULIP, FlowerType.LILY,
//                FlowerType.ROSE, FlowerType.GERBERA, FlowerType.CARNATION
        return null;
    }
}
