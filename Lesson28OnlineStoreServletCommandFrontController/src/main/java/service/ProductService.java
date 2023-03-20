package service;

import models.Products;
import repository.ProductRepository;
import repository.impl.ProductRepositoryImpl;

import java.util.List;

public class ProductService {
    private final ProductRepository productService = new ProductRepositoryImpl();

    public List<Products> getProducts() {
        return productService.getProducts();
    }

    public Products getProductById(Long id) {
        return productService.getProductById(id);
    }

    public List<Products> getProductsByCategoryId(Long id) {
        return productService.getProductsByCategory(id);
    }
}
