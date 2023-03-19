package repository;

import models.Products;

import java.util.List;

public interface ProductRepository extends Repository {
    List<Products> getProducts();

    Products getProductById(Long id);

    List<Products> getProductsByCategory(Long categoryId);
}
