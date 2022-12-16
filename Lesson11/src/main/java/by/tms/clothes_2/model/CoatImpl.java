package by.tms.clothes_2.model;

import by.tms.clothes_2.service.Coat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CoatImpl implements Coat {

    @Override
    public void dress() {
        System.out.println("I have dressed up the coat");
    }

    @Override
    public void undress() {
        System.out.println("I have undressed the coat");
    }
}
