package main;
import models.*;
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
public class Main {
    public static void main(String[] args) {
        CreateWarriorSquadFactory elfSquad = new ElfSquadImpl();
        elfSquad.createArcher().getWeaponType();
        elfSquad.createWizard().getWeaponType();
        elfSquad.createWarrior().getWeaponType();
        elfSquad.createWarrior().getWeaponType();
        System.out.println("!!!!!!");
        CreateCarFactory mercedes = new MercedesHubImpl();
        mercedes.sportCar().getDistance();
        CreateCarFactory bmw = new BMWHubImpl();
        bmw.trackCar().getDistance();
        CreateCarFactory nissan = new NissanHubImpl();
        nissan.suvCar().getDistance();
        CreateWarriorSquadFactory createWarriorFactory = createWarriorByType("OrkSquad");
        createWarriorFactory.createArcher().getWeaponType();
        CreateWarriorSquadFactory people = createWarriorByType("PeopleSquad");
        people.createWizard().getWeaponType();
        CreateWarriorSquadFactory elf = createWarriorByType("ElfSquad");
        elf.createWarrior().getWeaponType();
        CreateWarriorSquadFactory elfByMethod = createWarriorByType("eLfSquad");
        elfByMethod.createArcher().getWeaponType();
        CreateCarFactory bmwCar = createCarByModel("BmwHub");
        bmwCar.suvCar().getDistance();
        CreateCarFactory nissanCar = createCarByModel("NissanHub");
        nissanCar.trackCar().getSpeed();
        CreateCarFactory mercedesCar = createCarByModel("MercedesHub");
        mercedesCar.sportCar().getInsurance();
    }

    static CreateWarriorSquadFactory createWarriorByType(String type) {
        if (type.equalsIgnoreCase("PeopleSquad")) {
            return new PeopleSquadImpl();
        } else if (type.equalsIgnoreCase("OrkSquad")) {
            return new OrkSquadImpl();
        } else if (type.equalsIgnoreCase("ElfSquad")) {
            return new ElfSquadImpl();
        } else {
            throw new RuntimeException(type + " is not found");
        }
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