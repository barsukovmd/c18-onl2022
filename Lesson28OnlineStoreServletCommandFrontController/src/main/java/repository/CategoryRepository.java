package repository;

import models.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> getCategories();

    Category getCategoryById(Long id);

    Category getCategoryByName(String name);
}