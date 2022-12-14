package by.tms.clothesDressingUp.model;

import by.tms.clothesDressingUp.service.Coat;
import by.tms.clothesDressingUp.service.Pants;
import by.tms.clothesDressingUp.service.Shoes;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
//У человека поля:
////        -имя
////        -куртка -штаны -обувь
////        У человека есть 2 метода:
////        - одеться(вызываются методы надет одеть у всех вещей) - раздеться (вызываются методы снять у всех вещей)
public class Person implements Coat, Pants, Shoes {
    public Person(String name, Coat coat, Pants pants, Shoes shoes) {
        this.name = name;
        this.coat = coat;
        this.pants = pants;
        this.shoes = shoes;
    }

    private String name;
    private Coat coat;
    private Pants pants;
    private Shoes shoes;


    @Override
    public void dress() {
        if (checkPersonForDressing()) {
            coat.dress();
            pants.dress();
            shoes.dress();
        }
    }

    @Override
    public void undress() {
        if (!checkPersonForDressing()) {
            coat.undress();
            pants.undress();
            shoes.undress();
        }
    }

    public boolean checkPersonForDressing() {
        System.out.println("Person has dressed up");
        return true;
    }
}
