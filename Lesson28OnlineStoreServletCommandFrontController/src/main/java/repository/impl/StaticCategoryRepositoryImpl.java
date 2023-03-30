package repository.impl;

import models.Category;
import repository.CategoryRepository;

import java.util.List;

public class StaticCategoryRepositoryImpl implements CategoryRepository {

    @Override
    public List<Category> getCategories() {
        return null;
    }

    @Override
    public Category getCategoryById(Long id) {
        return null;
    }

    @Override
    public Category getCategoryByName(String name) {
        return null;
    }
}
