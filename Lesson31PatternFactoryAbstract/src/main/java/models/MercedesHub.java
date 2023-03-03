package models;

public class MercedesHub implements CreateCarFactoryImpl {
    @Override
    public Car1 createCar1() {
        return new Car1();
    }

    @Override
    public Car2 createCar2() {
        return new Car2();
    }

    @Override
    public Car3 createCar3() {
        return new Car3();
    }
}
