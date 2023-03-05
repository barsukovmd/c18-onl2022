package onlineStore.repository;


import onlineStore.model.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> getCategories();

    Category getCategory(int id);
}
