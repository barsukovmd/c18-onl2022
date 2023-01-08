package exercise1.models;

public interface StoreAware {
    public boolean addProduct(Integer id, Product product);

    public boolean deleteProduct(Integer id, Product product);

    public boolean editProduct(Integer id, Product product);
}
