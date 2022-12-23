package by.tms.figures.service;

import lombok.experimental.SuperBuilder;

@SuperBuilder
//почему-то не видит мой superbuilder ошибка
//java: cannot find symbol
//  symbol:   class FigureBuilder
//  location: class by.tms.figures.service.Figure
public class Triangle extends Figure implements IFigure {
    private double height;
    private double base;

    @Override
    public double getSquare() {
        return height * base / 2;
    }

    @Override
    public Type getType() {
        return Type.TRIANGLE;
    }
}
