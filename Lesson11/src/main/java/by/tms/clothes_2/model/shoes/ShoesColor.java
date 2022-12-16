package by.tms.clothes_2.model.shoes;

import by.tms.clothes_2.service.Shoes;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ShoesColor implements Shoes {
    private String shoesColor;

    @Override
    public void dress() {
        System.out.println("I have put on shoes" + shoesColor + " color");
    }

    @Override
    public void undress() {
        System.out.println("I have take off shoes" + shoesColor + " color");
    }
}
