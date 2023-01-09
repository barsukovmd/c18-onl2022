package exercise1.models;

import java.util.Map;

public interface StoreAware {
    public boolean addProduct(Product product);

    public boolean deleteProduct(Product product);

    public boolean editProduct(Integer id, Product product);

    Map<Integer, Product> getProducts();
}
