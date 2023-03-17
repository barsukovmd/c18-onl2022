package main.service;

import main.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(String type);

    String getProductTypeValueById(Long productId);
}
