package by.tms.figures.service;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class Figure {
    abstract Type getType();
}
