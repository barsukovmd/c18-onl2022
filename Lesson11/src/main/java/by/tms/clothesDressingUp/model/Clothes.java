package by.tms.clothesDressingUp.model;

import by.tms.clothesDressingUp.service.Coat;
import by.tms.clothesDressingUp.service.Pants;
import by.tms.clothesDressingUp.service.Shoes;

public class Clothes implements Pants, Shoes, Coat {
    public Clothes() {
        super();
    }

    @Override
    public void dress() {

    }

    @Override
    public void undress() {

    }
}
