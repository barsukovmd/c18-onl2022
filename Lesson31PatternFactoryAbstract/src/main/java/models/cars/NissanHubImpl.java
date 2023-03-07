package models.cars;

public class NissanHubImpl implements CreateCarFactory {
    @Override
    public CarBasic suvCar() {
        return new CarBasic();
    }

    @Override
    public CarPremium trackCar() {
        return new CarPremium();
    }

    @Override
    public CarVIP sportCar() {
        return new CarVIP();
    }
}
