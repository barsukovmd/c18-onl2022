package by.tms.clothes_2.model;

import by.tms.clothes_2.service.Pants;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PantsImpl implements Pants {
    @Override
    public void dress() {
        System.out.println("I have dressed up pants");
    }

    @Override
    public void undress() {
        System.out.println("I have undressed pants");
    }
}
