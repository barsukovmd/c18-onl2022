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

    public void dressUpMan() {
        for (Clothes clothes : clothes) {
            for (Class<?> cloth : clothes.getClass().getInterfaces()) {
                if (cloth == ManClothes.class) {
                    ((ManClothes) clothes).dressMan();
                }
            }
        }
    }

    public void dressUpWoman() {
        for (Clothes clothes : clothes) {
            for (Class<?> cloth : clothes.getClass().getInterfaces()) {
                if (cloth == WomanClothes.class) {
                    ((WomanClothes) clothes).dressWoman();
                }
            }
        }
    }

    public void dressUp(PersonType personType) {
        for (Clothes dress : clothes) {
            if (checkPersonClothes(dress, personType)) {
                switch (personType) {
                    case WOMAN -> ((WomanClothes) clothes).dressWoman();
                    case MAN -> ((ManClothes) clothes).dressMan();
                }
            }
        }
    }

    public boolean checkPersonClothes(Clothes clothes, PersonType personType) {
        for (Class<?> checkClothes : clothes.getClass().getInterfaces()) {//я так понял что сюда можно ставить вопрос
            //потому что сюда записывается Object и ссылка на него, прокомментируйте пожалуйста
            if (checkClothes == personType.getCheck()) {
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
