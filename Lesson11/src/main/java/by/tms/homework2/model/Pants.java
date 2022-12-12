package by.tms.homework2.model;

import by.tms.homework2.service.ManClothes;
import by.tms.homework2.service.WomanClothes;

public class Pants extends Clothes implements ManClothes, WomanClothes {
    public Pants(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
