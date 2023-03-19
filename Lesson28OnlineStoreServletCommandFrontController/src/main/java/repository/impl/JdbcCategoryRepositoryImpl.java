package repository.impl;

import models.Category;
import repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import repository.utils.ConnectionWrapper;

@AllArgsConstructor
public class JdbcCategoryRepositoryImpl implements CategoryRepository {
    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper =) {

        }
    }

    @Override
    public Category getCategory(Long id) {
        return null;
    }
}
