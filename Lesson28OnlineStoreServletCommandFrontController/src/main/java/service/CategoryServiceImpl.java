package service;

import models.Category;
import repository.CategoryRepository;
import repository.impl.JdbcCategoryRepositoryImpl;

import java.util.List;

public class CategoryServiceImpl implements CategoryServiceAware {
    private final CategoryRepository categoryRepository = new JdbcCategoryRepositoryImpl();

    @Override
    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.getCategoryById(id);
    }

    @Override
    public Category getCategoryByName(String name) {
        return categoryRepository.getCategoryByName(name);
    }
}
