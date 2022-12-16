package by.tms.clothes_2.model;

import by.tms.clothes_2.service.Shoes;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ShoesImpl implements Shoes {
    @Override
    public void dress() {
        System.out.println("I have put on shoes");
    }

    @Override
    public void undress() {
        System.out.println("I have take off shoes");
    }
}
