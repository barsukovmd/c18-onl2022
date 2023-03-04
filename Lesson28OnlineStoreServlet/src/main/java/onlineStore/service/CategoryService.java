package onlineStore.service;

import lombok.AllArgsConstructor;
import onlineStore.model.*;
import onlineStore.repository.*;

import java.util.*;

@AllArgsConstructor
public class CategoryService implements CategoryServiceAware {

    private final CategoryRepository categoryRepository;

    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }

    public Category getCategoryById(int id) {
        return categoryRepository.getCategory(id);
    }

    @Override
    public Category getCategoryByName(String name) {
        return null;
    }
}
