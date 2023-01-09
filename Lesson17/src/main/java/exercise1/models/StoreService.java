package exercise1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;


@Getter
@ToString
@AllArgsConstructor
//     * Создать класс Магазин, поля:
//     * • Список товаров (изначально пустой)
//     * методы:

//     * • добавить товар(принимает объект товара и добавляет его в список
//     * товаров). При попытке добавить товар с id уже существующем в списке,
//     * вставка производится не должна

//     * • получить все товары(метод ВОЗВРАЩАЕТ список всех товаров в
//     * магазине)
//     * • удалить товар (метод принимает id товара и удаляет из списка товар с
//     * соответствующим id)
//     * • редактировать товар(принимает объект товара и редактирует им список
//     * товаров)
//     * Обратите внимание что id товара и индекс товара в списке — это разные вещи, не перепутайте.
//     * Id товара — это поле вашего объекта, вы при его создании его задаете. А индекс товара в списке товаров, это по сути его порядковый номер в списке(начинается с 0).
//
public class StoreService implements StoreAware {
    private Store store;

    @Override
    public boolean addProduct(Product product) {
        Map<Integer, Product> productType = new HashMap<>();
        productType.put(product.getId(), product);
        return true;
    }

    @Override
    public boolean deleteProduct(Product product) {
        Map<Integer, Product> deleteProduct = new HashMap<>();
        deleteProduct.put(product.getId(), product);
        return true;
    }

    @Override
    public boolean editProduct(Integer id, Product product) {
        Map<Integer, Product> editProduct = new HashMap<>();
        editProduct.entrySet().add(new Map.Entry<>() {
            @Override
            public Integer getKey() {
                return product.getId();
            }

            @Override
            public Product getValue() {
                return product;
            }

            @Override
            public Product setValue(Product value) {
                return new Product(value.getId(), value.getName(), value.getPrice());
            }
        });
        return true;
    }

    @Override
    public Map<Integer, Product> getProducts() {
        return store.getProducts();
    }
}
