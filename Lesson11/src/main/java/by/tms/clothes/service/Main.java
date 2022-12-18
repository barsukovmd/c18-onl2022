package by.tms.clothes.service;

import by.tms.clothes.model.*;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

import static by.tms.clothes.model.ClothesType.*;
import static by.tms.clothes.model.Size.*;

@SuperBuilder
@ToString
@Getter

//* Задача2: Одежда
//        *
//        * 1) Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L).
//        * Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
//        * Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
//        * Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40), соответствующее каждому размеру.
//        * Создать конструктор, принимающий на вход euroSize.
//        * 2) Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
//        * 3) Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
//        * 4) Создать классы наследники Одежды - Футболка (реализует и интерфейсы "Мужская Одежда" и "Женская Одежда"),
//        * Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Юбка (реализует интерфейсы "Женская Одежда"),
//        * Галстук (реализует интерфейсы "Мужская Одежда").
//        * 5) Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину,
//        * одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды.
//        * Метод одетьЖенщину выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.
//        *
public class Main {
    public static void main(String[] args) {
        ArrayList<Clothes> clothes = new ArrayList<>();
        clothes.add(createClothes(SKIRT, XS, "Blue", 100));
        clothes.add(createClothes(TSHIRT, XS, "Red", 150));
        clothes.add(createClothes(TSHIRT, L, "Green", 100));
        clothes.add(createClothes(TIE, M, "Brown", 100));
        Studio studio = new Studio(clothes);
        studio.dressUp(PersonType.MAN);
        studio.dressWoman();
    }

    private static Clothes createClothes(ClothesType clothesType, Size size, String color, int price) {
        return switch (clothesType) {

            case SKIRT -> Skirt.builder()
                    .color(color)
                    .price(price)
                    .size(size.ordinal())
                    .build();

            case TIE -> Tie.builder()
                    .color(color)
                    .price(price)
                    .size(size.ordinal())
                    .build();

            case TSHIRT -> TShirt.builder()
                    .color(color)
                    .price(price)
                    .size(size.ordinal())
                    .build();
            case PANTS -> Pants.builder()
                    .color(color)
                    .price(price)
                    .size(size.ordinal())
                    .build();
        };
    }
}
