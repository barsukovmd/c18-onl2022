package homework9Task2;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower("Гербера", FlowerType.GERBERA);
        int a = flower.getFlowerType().getCost();
        System.out.println(a);
    }
}
