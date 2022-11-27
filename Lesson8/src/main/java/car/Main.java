package car;
public class Main {
    public static void main(String[] args) {
        System.out.println("Turn on your car engine");
        Car[] cars = new Car[10];
        cars[0].getEngine().on();
        cars[0].getEngine().rideTheCar();
        cars[0].getEngine().checkResourceOfEngine(10);
        cars[0].getEngine().off();
        cars[0].getEngine().rideTheCar();
        cars[0].getEngine().on();
    }
}
