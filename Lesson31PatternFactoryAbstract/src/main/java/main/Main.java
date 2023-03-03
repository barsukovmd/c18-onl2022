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
        CreateWarriorFactoryImpl elfSquad = new ElfSquad();
        elfSquad.createArcher().getWeaponType();
        elfSquad.createWizard().getWeaponType();
        elfSquad.createWarrior().getWeaponType();
        System.out.println("!!!!!!");
        CreateCarFactoryImpl mercedes = new MercedesHub();
        mercedes.createCar1().getDistance();
        CreateCarFactoryImpl bmw = new BMWHub();
        bmw.createCar2().getDistance();
        CreateCarFactoryImpl nissan = new NissanHub();
        nissan.createCar3().getDistance();
        CreateWarriorFactoryImpl createWarriorFactory = createWarriorByType("OrkSquad");
        createWarriorFactory.createArcher().getWeaponType();
        CreateWarriorFactoryImpl people = createWarriorByType("PeopleSquad");
        people.createWizard().getWeaponType();
        CreateWarriorFactoryImpl elf = createWarriorByType("ElfSquad");
        elf.createWarrior().getWeaponType();
        CreateWarriorFactoryImpl elfByMethod = createWarriorByType("eLfSquaD");
        elf.createArcher().getWeaponType();
    }

    static CreateWarriorFactoryImpl createWarriorByType(String type) {
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
}