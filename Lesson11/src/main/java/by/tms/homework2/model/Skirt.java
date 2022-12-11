package by.tms.homework2.model;

import by.tms.homework2.service.WomanClothes;

public class Skirt extends Clothes implements WomanClothes {
    public Skirt(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
    }
}
