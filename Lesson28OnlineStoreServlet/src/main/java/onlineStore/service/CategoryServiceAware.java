package onlineStore.service;


import onlineStore.model.*;

import java.util.List;

public interface CategoryServiceAware {

    List<Category> getCategories();

    Category getCategoryById(int id);

    Category getCategoryByName(String name);
}
