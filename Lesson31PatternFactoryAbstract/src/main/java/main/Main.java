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
        CreateWarriorSquadFactoryImpl elfSquad = new ElfSquad();
        elfSquad.createArcher().getWeaponType();
        elfSquad.createWizard().getWeaponType();
        elfSquad.createWarrior().getWeaponType();
        elfSquad.createWarrior().getWeaponType();
        System.out.println("!!!!!!");
        CreateCarFactoryImpl mercedes = new MercedesHub();
        mercedes.sportCar().getDistance();
        CreateCarFactoryImpl bmw = new BMWHub();
        bmw.trackCar().getDistance();
        CreateCarFactoryImpl nissan = new NissanHub();
        nissan.suvCar().getDistance();
        CreateWarriorSquadFactoryImpl createWarriorFactory = createWarriorByType("OrkSquad");
        createWarriorFactory.createArcher().getWeaponType();
        CreateWarriorSquadFactoryImpl people = createWarriorByType("PeopleSquad");
        people.createWizard().getWeaponType();
        CreateWarriorSquadFactoryImpl elf = createWarriorByType("ElfSquad");
        elf.createWarrior().getWeaponType();
        CreateWarriorSquadFactoryImpl elfByMethod = createWarriorByType("eLfSquad");
        elfByMethod.createArcher().getWeaponType();
        CreateCarFactoryImpl bmwCar = createCarByModel("BmwHub");
        bmwCar.suvCar().getDistance();
        CreateCarFactoryImpl nissanCar = createCarByModel("NissanHub");
        nissanCar.trackCar().getSpeed();
        CreateCarFactoryImpl mercedesCar = createCarByModel("MercedesHub");
        mercedesCar.sportCar().getInsurance();
    }

    static CreateWarriorSquadFactoryImpl createWarriorByType(String type) {
        if (type.equalsIgnoreCase("PeopleSquad")) {
            return new PeopleSquad();
        } else if (type.equalsIgnoreCase("OrkSquad")) {
            return new OrkSquad();
        } else if (type.equalsIgnoreCase("ElfSquad")) {
            return new ElfSquad();
        } else {
            throw new RuntimeException(type + " is not found");
        }
    }

    static CreateCarFactoryImpl createCarByModel(String model) {
        if (model.equalsIgnoreCase("NissanHub")) {
            return new NissanHub();
        } else if (model.equalsIgnoreCase("MercedesHub")) {
            return new MercedesHub();
        } else if (model.equalsIgnoreCase("bmwHUB")) {
            return new BMWHub();
        } else {
            throw new RuntimeException(model + " is not found");
        }
    }
}