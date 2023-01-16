package exercise1.models;

import java.util.List;

public interface StoreAware {
    public boolean addProduct(Product product);

    public boolean deleteProduct(Product product);

    public void editProduct(long id, ProductType productType, long price);

    List<Product> getProducts();
}
