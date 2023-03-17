package structural.decorator2;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Mocha(new Whip(new Espresso()));
        System.out.println(beverage.getCost());
        System.out.println(beverage.getDescription());
        Beverage beverage1 = new Whip(new HouseBlend());
        System.out.println(beverage1.getCost());
        System.out.println(beverage1.getDescription());
    }
}
