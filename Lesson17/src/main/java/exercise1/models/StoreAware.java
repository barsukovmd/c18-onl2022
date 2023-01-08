package exercise1.models;

public interface StoreAware {
    public boolean addProduct(Product product);

    public boolean deleteProduct(Product product);

    public boolean editProduct(Integer id, Product product);
}
