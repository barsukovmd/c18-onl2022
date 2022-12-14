package by.tms.homework2.model;

import by.tms.homework2.service.ManClothes;
import by.tms.homework2.service.WomanClothes;

import java.util.ArrayList;

//* 5) Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину,
////        * одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды.
////        * Метод одетьЖенщину выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.
////        *
public class Studio implements ManClothes, WomanClothes {
    private ArrayList<Clothes> clothes;

    public Studio(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    private boolean checkClothes(Clothes clothes, PersonType personType) {
        for (Class checkClothes : clothes.getClass().getInterfaces()) {
            if (checkClothes == personType.getIClass()) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
