package by.tms.homework2.model;

import by.tms.homework2.service.ManClothes;
import by.tms.homework2.service.WomanClothes;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class TShirt extends Clothes implements ManClothes, WomanClothes {

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
