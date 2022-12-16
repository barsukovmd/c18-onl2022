package by.tms.clothes.model;

import by.tms.clothes.service.ManClothes;
import by.tms.clothes.service.WomanClothes;
import lombok.experimental.SuperBuilder;

import static by.tms.clothes.model.PersonType.MAN;
import static by.tms.clothes.model.PersonType.WOMAN;

@SuperBuilder

public class Pants extends Clothes implements ManClothes, WomanClothes {

    @Override
    public void dressMan() {
        System.out.println("Pants for " + MAN + getColor() + " color" + getPrice() + " price" + getSize() + " size.");

    }

    @Override
    public void dressWoman() {
        System.out.println("Pants for " + WOMAN + getColor() + " color" + getPrice() + " price" + getSize() + " size.");
    }
}
