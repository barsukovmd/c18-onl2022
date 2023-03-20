package service;

import models.Category;

import java.util.List;

public interface CategoryServiceAware {
    List<Category> getCategories();

    Category getCategoryById(Long id);

    Category getCategoryByName(String name);
}
