package by.tms.clothes_2.service;

import by.tms.clothes_2.model.Person;
import by.tms.clothes_2.model.coat.CoatBrand;
import by.tms.clothes_2.model.coat.CoatColor;
import by.tms.clothes_2.model.pants.PantsBrand;
import by.tms.clothes_2.model.pants.PantsColor;
import by.tms.clothes_2.model.shoes.ShoesBrand;
import by.tms.clothes_2.model.shoes.ShoesColor;

//2)
//        По аналогии с первым задание делаем след. задание. Интерфейсы:
//        - Куртка
//        - Штаны
//        - Обувь
//        в каждом интерфейсе есть 2 метода (надеть и снять)
//        Делаем несколько реализации каждого интерфейса. Создаём класс человек:
//        У человека поля:
//        -имя
//        -куртка
//        -штаны
//        -обувь
//        У человека есть 2 метода:
//        - одеться(вызываются методы надет одеть у всех вещей) - раздеться (вызываются методы снять у всех вещей)
public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[10];
        person[0] = new Person(new CoatColor("Blue"), new ShoesColor("Grey"), new PantsColor("Blue"));
        person[0].dress();
        person[0].undress();
        person[1] = new Person(new CoatBrand("Gucci"), new ShoesBrand("Michael Kors"), new PantsBrand("Adidas"));
        person[1].dress();
        person[1].undress();
    }
}
