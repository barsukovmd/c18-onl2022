package exercise1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;


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
        if (!store.getProducts().contains(product)) {
            return store.getProducts().add(product);
        }
        return false;
    }

    @Override
    public boolean deleteProduct(Product product) {
        return store.getProducts().removeIf(productType -> productType.equals(product));
    }

    @Override
    public void editProduct(long id, ProductType productType, long price) {
        store.getProducts().stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .ifPresent(newProduct -> correctProduct(productType, price, newProduct));
    }

    @Override
    public List<Product> getProducts() {
        return store.getProducts();
    }

    private void correctProduct(ProductType was, long price, Product become) {
        System.out.println(was.name().equals(become.getProductType().name()));
    }
}
