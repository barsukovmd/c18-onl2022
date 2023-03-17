package structural.adapter3;

public class Main {

    public static void main(String[] args) {
        Car car = new AdapterTruckToCar(new MyTrack());
        car.washCar();
    }
}
