package by.tms.homework2.model;

import by.tms.homework2.service.ManClothes;
import by.tms.homework2.service.WomanClothes;

public class TShirt extends Clothes implements ManClothes, WomanClothes {
    public TShirt(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
