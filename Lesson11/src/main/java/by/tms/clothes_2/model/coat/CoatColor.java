package by.tms.clothes_2.model.coat;

import by.tms.clothes_2.service.Coat;

public class CoatColor implements Coat {
    private String color;

    public CoatColor(String color) {
        this.color = color;
    }

    @Override
    public void dress() {
        System.out.println("I have dressed up the coat" + " color");
    }

    @Override
    public void undress() {
        System.out.println("I have undressed the coat" + color + " color");

    }
}
