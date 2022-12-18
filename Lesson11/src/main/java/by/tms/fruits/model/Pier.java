package by.tms.fruits.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Pier extends Fruit {
    @Override
    public Type getType() {
        return Type.PIER;
    }
}
