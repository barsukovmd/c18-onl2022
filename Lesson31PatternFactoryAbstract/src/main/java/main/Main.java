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
        CreateWarriorImpl createWarrior = new ElfSquad();
        createWarrior.createArcher().getWeaponType();
        createWarrior.createWizard().getWeaponType();
        createWarrior.createWarrior().getWeaponType();
    }
}