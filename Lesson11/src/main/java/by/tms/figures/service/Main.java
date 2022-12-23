package by.tms.figures.service;

import java.util.ArrayList;
import java.util.List;

//* Задача4*(звездочка)
//     * Используя перечисления(enum), реализовать программу по вычислению площади фигуры (метод getSquare).
//     * Создать классы Фигура, Линия, Треугольник, Прямоугольник. Можно пользоваться интерфейсами, при необходимости!
//     * Если у фигуры нельзя вычислить площадь, то метод не должен быть реализован в в этом классе.
//     * Добавить фигуры в массив, пробежать по массиву и вызвать метод getSquare.
//     * Внимание!!! пользоваться instanceof НЕЛЬЗЯ, тут нужно применить перечисления.
public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(Rectangle.builder()
                .firstSide(11.9)
                .secondSide(3.7)
                .build());
        figures.add(Circle.builder()
                .radius(10)
                .build());
        figures.add(Line.builder()
                .length(3)
                .build());
        figures.add(Triangle.builder()
                .base(7)
                .height(10.7)
                .build());

        for (Figure figure : figures) {
            if (figure.getType() != Type.LINE) {
                printSquare(figure);
            } else {
                System.out.println("Square for line cannot be counted");
            }
        }
    }

    private static void printSquare(Figure figure) {
        System.out.println(figure.getType() + " Square = " + ((IFigure) figure).getSquare());
    }
}
