package by.tms.homework2.model;

import by.tms.homework2.service.ManClothes;
import by.tms.homework2.service.WomanClothes;
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
