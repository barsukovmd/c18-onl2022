package exercise1;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
//    /**
//     * Необходимо реализовать магазин продуктов.
//     * Создать класс Товар, поля:
//     * • id(целое число)
//     * • name(строка)
//     * • price(целое число)
public class Product {
    private int id;
    private String name;
    private int price;
}
