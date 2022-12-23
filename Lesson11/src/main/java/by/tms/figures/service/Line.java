package by.tms.figures.service;

import lombok.experimental.SuperBuilder;

import static by.tms.figures.service.Type.LINE;

@SuperBuilder
public class Line extends Figure {

    private double length;

    @Override
    Type getType() {
        return LINE;
    }
}
