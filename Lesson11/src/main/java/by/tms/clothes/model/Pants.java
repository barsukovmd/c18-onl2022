package by.tms.clothes.model;

import by.tms.clothes.service.ManClothes;
import by.tms.clothes.service.WomanClothes;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Pants extends Clothes implements ManClothes, WomanClothes {

    @Override
    public void dressMan() {
        System.out.println("Pants for " + PersonType.MAN + getColor() + " color" + getPrice() + " price" + getSize() + " size.");

    }

    @Override
    public void dressWoman() {
        System.out.println("Pants for " + PersonType.WOMAN + getColor() + " color" + getPrice() + " price" + getSize() + " size.");
    }
}
