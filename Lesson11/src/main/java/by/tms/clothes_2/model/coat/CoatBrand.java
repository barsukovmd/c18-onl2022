package by.tms.clothes_2.model.coat;

import by.tms.clothes_2.service.Coat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class CoatBrand implements Coat {
    private String brand;

    @Override
    public void dress() {
        System.out.println("I have dressed up the coat");
    }

    @Override
    public void undress() {
        System.out.println("I have undressed the coat");
    }
}
