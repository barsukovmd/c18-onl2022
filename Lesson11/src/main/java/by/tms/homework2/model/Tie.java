package by.tms.homework2.model;

import by.tms.homework2.service.ManClothes;
import lombok.experimental.SuperBuilder;

@SuperBuilder
class Tie extends Clothes implements ManClothes {

    public Tie(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
    }
}
