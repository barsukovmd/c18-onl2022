package models;

public interface CreateCarFactory {
    CarBasic suvCar();

    CarPremium trackCar();

    CarVIP sportCar();
}
