package by.tms.homework1.service;

// * Задача1:
// * Интерфейс Инструмент
// *
// * 1) Создать интерфейс Инструмент(внутри enum Type с перечислением типов инструментов) и реализующие его классы Гитара, Барабан и Труба.
// * 2) Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
// * 3) Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
// * 4) Создать массив типа Инструмент, содержащий инструменты разного типа.
// * 5) Наполнять массив инструментами необходимо через метод createInstrument,
// * который на вход принимает Тип инструмента(enum) и создает конкретный инструмент.
// * 6) В цикле вызвать метод play() для каждого инструмента, который должен выводить строку
// * "Играет такой-то инструмент, с такими-то характеристиками".


import by.tms.homework1.model.Drum;
import by.tms.homework1.model.Guitar;
import by.tms.homework1.model.Trumpet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(createInstrument(Instrument.Type.GUITAR, 10));
        instruments.add(createInstrument(Instrument.Type.GUITAR, 12));
        instruments.add(createInstrument(Instrument.Type.DRUM, 15));
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    public static Instrument createInstrument(Instrument.Type instrument, int parameter) {
        return switch (instrument) {
            case DRUM -> new Drum(parameter);
            case TRUMPET -> new Trumpet(parameter);
            case GUITAR -> new Guitar(parameter);
        };
    }
}
