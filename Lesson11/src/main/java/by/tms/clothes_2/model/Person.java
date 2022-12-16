package by.tms.clothes_2.model;

import by.tms.clothes_2.service.Coat;
import by.tms.clothes_2.service.Pants;
import by.tms.clothes_2.service.Shoes;
//У человека поля:
////        -имя
////        -куртка -штаны -обувь
////        У человека есть 2 метода:
////        - одеться(вызываются методы надет одеть у всех вещей) - раздеться (вызываются методы снять у всех вещей)

public class Person implements Coat, Shoes, Pants {

    private String name;
    private Coat coat;
    private Pants pants;
    private Shoes shoes;

    @Override
    public void dress() {
        coat.dress();
        pants.dress();
        shoes.dress();
    }

    @Override
    public void undress() {
        coat.undress();
        pants.undress();
        shoes.undress();
    }
}
