package models;

public class MercedesHub implements CreateCarFactoryImpl {
    @Override
    public Car1 suvCar() {
        return new Car1();
    }

    @Override
    public Car2 trackCar() {
        return new Car2();
    }

    @Override
    public Car3 sportCar() {
        return new Car3();
    }
}
