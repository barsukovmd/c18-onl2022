package by.tms.clothes.model;

import by.tms.clothes.service.ManClothes;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Tie extends Clothes implements ManClothes {
    @Override
    public void dressMan() {
        System.out.println("Tie for " + PersonType.MAN + getColor() + " color" + getPrice() + " price" + getSize() + " size.");
    }
}
