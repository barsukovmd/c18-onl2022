package exercise1.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
//    /**
//     * Необходимо реализовать магазин продуктов.
//     * Создать класс Товар, поля:
//     * • id(целое число)
//     * • name(строка)
//     * • price(целое число)
public class Product {
    long id;
    ProductType productType;
    private long price;

    public Product(long id, ProductType productType, long price) {
        this.id = id;
        this.productType = productType;
        this.price = price;
    }
}
