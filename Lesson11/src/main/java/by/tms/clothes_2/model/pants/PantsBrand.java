package by.tms.clothes_2.model.pants;

import by.tms.clothes_2.service.Pants;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PantsBrand implements Pants {
    private String pantsBrand;

    @Override
    public void dress() {
        System.out.println("I have dressed up pants" + pantsBrand + " brand");
    }

    @Override
    public void undress() {
        System.out.println("I have undressed pants" + pantsBrand + " brand");
    }
}
