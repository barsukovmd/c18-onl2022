package car;

import java.util.Arrays;

/*
//- Машина имеет двигатель, бензобак (реализуйте класс для каждой сущности).
 // Чтобы поехать, машину необходимо завести, т.е. включить двигатель.
         -// Реализуйте методы включения машины, который в свою очередь включает её двигатель.
         -// Реализуйте метод езды на машине (например просто печатаем на консоль, что машина поехала)
         - //Если машина не заведена, ехать она не может.
         - //Машину можно заглушить.
         - После каждой поездки считаем, что машина прошла фиксированное расстояние.
         - Реализовать возможность посмотреть, какое расстояние машина прошла за все время.
         -// Чтобы создать машину, обязательно нужно иметь двигатель и бензобак.
         - Марка машины, год выпуска, пройденное расстояние - не обязательны при создании машины и могут быть выставлены потом.
         (не обязательно задавать в конструкторе)
         - После создания поменять двигатель машине нельзя.
         - Чтобы машина завелась, у неё должно быть топливо в бензобаке, если топлива нет, машина не может завестись.
         - Машину можно дозаправить, можно проверить сколько топлива осталось.
         - Реализуйте пару полей для двигателя и бензобака, например: тип двигателя, общий объем бензобака,
         сколько бензина сейчас и т.д.
         */
public class Main {//"this.engine" is null Подскажите, здесь похожая ошибка в null??

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Engine engine = new Engine(true, 100, 40);
        FuelTank fuelTank = new FuelTank(50);
        System.out.println("Turn on your car engine");
        cars[0] = new Car(engine, "BMW", 2020);
        cars[1] = new Car(engine, "Acura", 2020);
        cars[2] = new Car(engine, "Jeep", 2020);
        System.out.println(Arrays.toString(cars));
        cars[0].setFuelTank(new FuelTank(100));
        cars[0].getFuelTank().checkFuel(10);
        cars[0].getEngine().setResourceOfEngine(10);
        System.out.println(cars[0].getEngine().getResourceOfEngine());
        cars[1] = new Car(fuelTank, engine);
        cars[2] = new Car(fuelTank, engine);
    }
}