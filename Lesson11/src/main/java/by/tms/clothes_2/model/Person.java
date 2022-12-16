package by.tms.clothes_2.model;

import by.tms.clothes_2.service.Coat;
import by.tms.clothes_2.service.Pants;
import by.tms.clothes_2.service.Shoes;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString
//У человека поля:
////        -имя
////        -куртка -штаны -обувь
////        У человека есть 2 метода:
////        - одеться(вызываются методы надет одеть у всех вещей) - раздеться (вызываются методы снять у всех вещей)

public class Person implements Coat, Shoes, Pants {
    private Coat coat;
    private Shoes shoes;
    private Pants pants;

    public Person(Coat coat, Shoes shoes, Pants pants) {
        this.coat = coat;
        this.shoes = shoes;
        this.pants = pants;
    }

    @Override
    public void dress() {
        pants.dress();
        shoes.dress();
        coat.dress();
    }

    @Override
    public void undress() {
        pants.undress();
        shoes.undress();
        coat.undress();
    }
}
