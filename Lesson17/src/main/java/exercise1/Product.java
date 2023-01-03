package exercise1;

import lombok.Getter;

@Getter
//    /**
//     * Необходимо реализовать магазин продуктов.
//     * Создать класс Товар, поля:
//     * • id(целое число)
//     * • name(строка)
//     * • price(целое число)
public class Product {
    private final int id;
    private final String name;
    private final int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
