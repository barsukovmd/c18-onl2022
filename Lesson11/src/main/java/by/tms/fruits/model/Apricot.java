package by.tms.fruits.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Apricot extends Fruit {
    @Override
    public Type getType() {
        return Type.APRICOT;
    }
}
