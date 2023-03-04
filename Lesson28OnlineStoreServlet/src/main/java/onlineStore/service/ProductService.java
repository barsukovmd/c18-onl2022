package onlineStore.service;

import lombok.AllArgsConstructor;
import onlineStore.model.Product;
import onlineStore.repository.ProductRepository;

import java.util.List;

@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

    public List<Product> getProductsByCategoryId(int categoryId) {
        return productRepository.getProductsByCategoryId(categoryId);
    }
}
