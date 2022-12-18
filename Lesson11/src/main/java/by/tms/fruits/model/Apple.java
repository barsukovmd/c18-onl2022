package by.tms.fruits.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Apple extends Fruit {
    @Override
    public Type getType() {
        return Type.APPLE;
    }
}
