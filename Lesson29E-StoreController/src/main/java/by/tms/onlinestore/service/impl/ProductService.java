package by.tms.onlinestore.service.impl;

import by.tms.onlinestore.model.Inject;
import by.tms.onlinestore.model.Product;
import by.tms.onlinestore.repository.ProductRepository;
import lombok.Setter;

import java.util.List;

@Setter
public class ProductService {
    @Inject
    private ProductRepository productRepository;

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
