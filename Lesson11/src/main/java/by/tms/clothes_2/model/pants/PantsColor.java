package by.tms.clothes_2.model.pants;

import by.tms.clothes_2.service.Pants;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PantsColor implements Pants {
    private String color;

    @Override
    public void dress() {
        System.out.println("I have dressed up pants" + color + " color");
    }

    @Override
    public void undress() {
        System.out.println("I have undressed pants" + color + " color");
    }
}
