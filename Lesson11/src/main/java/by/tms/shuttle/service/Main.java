package by.tms.shuttle.service;

import by.tms.shuttle.model.OneSpace;
import by.tms.shuttle.model.Orbital;
import by.tms.shuttle.model.Shuttle;
import by.tms.shuttle.model.Spaceport;

//@Log4j//exception annotation
//3)
//        Создаем интерфейс IStart. В интерфейсе определяем методы: • предстартовая проверка систем(возвращает true/false)
//        • запуск двигателей(void)
//        • старт(void)
//        Создаем класс Космодром. В классе создаем метод:
//        • запуск
//        Метод запуск принимает объект типа IStart.
//        В методе первым делом осуществляем предстартовую проверку переданного объекта,
//        если она провалилась(метод вернул false) выводим сообщение «Предстартовая проверка
//        провалена». Если проверка прошла успешно, то производим запуск двигателей(вызываем
//        метод запуска двигателя). После этого производиться обратный отсчет (10 ..... 1). После
//        обратного отсчета вызываем метод старт переданного объекта.
//        Создаем класс Шатл. Шатл реализует интерфейс IStart.
//        • В методе предстартовой проверки генерируем случайное число в диапазоне от 0 до 10.
// Если сгенерированное число больше 3-х то проверка прошла успешно. Если нет, неуспешно.
//• В методе запуска двигателей выводим строку в консоль «Двигатели Шатла запущены.
//Все системы в норме.»
//• В методе старт выводим строку в консоль. «Старт Шатла»
//По аналогии создайте еще пару классов реализующих интерфейс Istart(например SpaceX).
//Для предстартовой проверки можете придумать совою логику, главное что бы метод
//возвращал true либо false в зависимости от того прошла ли она успешно. Запустите в космос созданные вами космические корабли используя созданный вами
//космодром и его метод старт.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shuttle shuttle = Shuttle.builder().build();
        shuttle.checkPreStart();
        shuttle.engineOn();
        shuttle.start();
        System.out.println("!!!");
        OneSpace oneSpace = OneSpace.builder().build();
        oneSpace.checkPreStart();
        oneSpace.engineOn();
        oneSpace.start();
        System.out.println("!!!");

        Spaceport spaceport = new Spaceport();
        IStart shuttle1 = new Shuttle();
        spaceport.start(shuttle1);
        IStart oneSpace1 = new OneSpace();
        spaceport.start(oneSpace1);
        IStart orbital = new Orbital();
        spaceport.start(orbital);
    }

}
