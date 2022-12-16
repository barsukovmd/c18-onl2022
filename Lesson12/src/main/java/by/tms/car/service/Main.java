package by.tms.car.service;

import by.tms.car.model.Car;
import by.tms.car.model.CarIsNotReadyForRide;

/**
 * Домашка.
 * 1) Можно добработать свой авто из предыдущей домашки, а можно заново сделать.
 * Создать собственное исключение.
 * - Создать класс Car c полями (марка, скорость, цена), конструкторы (с параметрами и default) гетеры-сетеры.
 * Создать метод старт в котором пытаетесь завести автомобиль. В методе старт генерируете случайное число от 0 до 20,
 * если полученное число оказалось четным,
 * то выбрасываете созданное ранее вами исключение и передаете его к месту откуда вызывали метод старт.
 * Если все хорошо и исключение не вылетело,
 * то выводить в консоль сообщение, что автомобиль с такой-то маркой завелся.
 * В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете исключение которое может вылететь при старте автомобиля
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", 240, 100000);
        Car car1 = new Car("BMW", 230, 80000);
        Car car2 = new Car("Audi", 220, 75000);
        try {
            car.start();
        } catch (CarIsNotReadyForRide e) {
            System.out.println(car + e.getMessage());
            return;
        }
        System.out.println("!!!");
        try {
            car1.start();
        } catch (CarIsNotReadyForRide e) {
            System.out.println(car1 + e.getMessage());
        }
        System.out.println("!!!");
        try {
            car2.start();
        } catch (CarIsNotReadyForRide e) {
            System.out.println(car2 + e.getMessage());
        }
    }

}
