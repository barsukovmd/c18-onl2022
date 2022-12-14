package by.tms.clothes.model;

import by.tms.clothes.service.ManClothes;
import by.tms.clothes.service.WomanClothes;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@SuperBuilder
@AllArgsConstructor
@Getter
@ToString

//* 5) Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину,
////        * одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды.
////        * Метод одетьЖенщину выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.
////        *
public class Studio implements ManClothes, WomanClothes {
    private ArrayList<Clothes> clothes;

    public void dressUp(PersonType personType) {
        for (Clothes clothes1 : clothes) {
            if (checkPersonClothes(clothes1, personType))
                switch (personType) {
                    case WOMAN -> ((WomanClothes) clothes1).dressWoman();
                    case MAN -> ((ManClothes) clothes1).dressMan();
                }
        }
    }

    public boolean checkPersonClothes(Clothes clothes, PersonType personType) {
        for (Class<?> checkClothes : clothes.getClass().getInterfaces()) {
            if (checkClothes == personType.getCheck()) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void dressMan() {
        for (Clothes clothes : clothes) {
            for (Class<?> cloth : clothes.getClass().getInterfaces()) {
                if (cloth == ManClothes.class) {
                    ((ManClothes) clothes).dressMan();
                }
            }
        }
    }

    @Override
    public void dressWoman() {
        for (Clothes clothes : clothes) {
            for (Class<?> cloth : clothes.getClass().getInterfaces()) {//я так понял что сюда можно ставить вопрос
                //потому что сюда записывается Object и ссылка на него, прокомментируйте пожалуйста
                if (cloth == WomanClothes.class) {
                    ((WomanClothes) clothes).dressWoman();
                }
            }
        }
    }
}
