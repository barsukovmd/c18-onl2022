package by.tms.fruits.service;

import by.tms.fruits.model.Apple;
import by.tms.fruits.model.Apricot;
import by.tms.fruits.model.Fruit;
import by.tms.fruits.model.Pier;

import java.util.ArrayList;
import java.util.List;

//* Задача3
//        * Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
//        * Класс Фрукт содержит:
//        * а) переменную вес,
//        * б) метод printManufacturerInfo(){System.out.print("Made in Belarus");} который нельзя изменить в наследнике.
//        * в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
//        * Метод должен учитывать вес фрукта(Т.е в зависимости от веса разная цена)
//        * Создать несколько объектов разных классов.
//        * Подсчитать общую стоимость проданных фруктов.
//        * А также общую стоимость отдельно проданных яблок, груш и абрикос.
//        *
//        * Задача4*(звездочка)
//        * Используя перечисления(enum), реализовать программу по вычислению площади фигуры (метод getSquare).
//        * Создать классы Фигура, Линия, Треугольник, Прямоугольник. Можно пользоваться интерфейсами, при необходимости!
//        * Если у фигуры нельзя вычислить площадь, то метод не должен быть реализован в в этом классе.
//        * Добавить фигуры в массив, пробежать по массиву и вызвать метод getSquare.
//        * Внимание!!! пользоваться instanceof НЕЛЬЗЯ, тут нужно применить перечисления.
//        */
public class Main {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(Apricot.builder().weight(5).pricePerPound(150).build());
        fruits.add(Apple.builder().weight(15).pricePerPound(180).build());
        fruits.add(Pier.builder().weight(12).pricePerPound(220).build());
        for (Fruit fruit : fruits) {
            double price = fruit.getPrice();
            fruit.printManufacturerInfo();
            System.out.println("\n" + price + " rubles," + " price for " + fruit.getType());
        }
    }
}
