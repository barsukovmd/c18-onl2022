package exercise1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
//    /**
//     * Необходимо реализовать магазин продуктов.
//     * Создать класс Товар, поля:
//     * • id(целое число)
//     * • name(строка)
//     * • price(целое число)
public class Product {//предлагает сделать record??
    private final int id;
    private final String name;
    private final int price;
}
