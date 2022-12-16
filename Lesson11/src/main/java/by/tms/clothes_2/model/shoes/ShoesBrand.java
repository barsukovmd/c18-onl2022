package by.tms.clothes_2.model.shoes;

import by.tms.clothes_2.service.Shoes;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ShoesBrand implements Shoes {
    private String shoeBrand;

    @Override
    public void dress() {
        System.out.println("I have put on shoes" + shoeBrand + " brand");
    }

    @Override
    public void undress() {
        System.out.println("I have take off shoes" + shoeBrand + " brand");
    }
}
