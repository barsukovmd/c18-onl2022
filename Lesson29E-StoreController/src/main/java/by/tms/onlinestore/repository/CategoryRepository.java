package by.tms.onlinestore.repository;

import by.tms.onlinestore.model.Category;

import java.util.List;

public interface CategoryRepository extends Repository {

    List<Category> getCategories();

    Category getCategoryById(int id);

    Category getCategoryByName(String name);
}
