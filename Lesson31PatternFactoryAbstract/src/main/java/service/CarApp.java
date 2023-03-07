package service;

import cars.BMWHubImpl;
import cars.CreateCarFactory;
import cars.MercedesHubImpl;
import cars.NissanHubImpl;

//Написать программу, эмулирующую компьютерную игру.
//В игре имеется несколько отрядов персонажей:
//- отряд орков
//- отряд элфов
//- отряд людей
//
//В каждом отряде есть следующие солдаты:
//- воин
//- маг
//- лучник
//
//Воин рубится на мечах.
//Маг колдует.
//Лучник стреляет из лука.
//
//Используя паттерн проектирования Abstract Factory, реализовать персонажей игры и их действия.
public class CarApp {
    public static void main(String[] args) {
        System.out.println("!!!!!!");
        CreateCarFactory mercedes = new MercedesHubImpl();
        mercedes.sportCar().getDistance();
        CreateCarFactory bmw = new BMWHubImpl();
        bmw.trackCar().getDistance();
        CreateCarFactory nissan = new NissanHubImpl();
        nissan.suvCar().getDistance();
        CreateCarFactory bmwCar = createCarByModel("BmwHub");
        bmwCar.suvCar().getDistance();
        CreateCarFactory nissanCar = createCarByModel("NissanHub");
        nissanCar.trackCar().getSpeed();
        CreateCarFactory mercedesCar = createCarByModel("MercedesHub");
        mercedesCar.sportCar().getInsurance();
    }

    static CreateCarFactory createCarByModel(String model) {
        if (model.equalsIgnoreCase("NissanHub")) {
            return new NissanHubImpl();
        } else if (model.equalsIgnoreCase("MercedesHub")) {
            return new MercedesHubImpl();
        } else if (model.equalsIgnoreCase("bmwHUB")) {
            return new BMWHubImpl();
        } else {
            throw new RuntimeException(model + " is not found");
        }
    }
}