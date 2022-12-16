package by.tms.clothes.model;

import by.tms.clothes.service.WomanClothes;
import lombok.experimental.SuperBuilder;

import static by.tms.clothes.model.PersonType.WOMAN;

@SuperBuilder
public class Skirt extends Clothes implements WomanClothes {

    @Override
    public void dressWoman() {
        System.out.println("Skirt for " + WOMAN + getColor() + " color" + getPrice() + " price" + getSize() + " size.");

    }
}
