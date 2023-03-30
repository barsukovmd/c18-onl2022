package repository.impl;

import models.Category;
import repository.CategoryRepository;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import repository.utils.ConnectionWrapper;
@AllArgsConstructor
public class JdbcCategoryRepositoryImpl implements CategoryRepository {
    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             Statement statement = connectionWrapper.getConnection().createStatement()) {
            String sql = "select * from categories";
            try (ResultSet rs = statement.executeQuery(sql)) {
                while (rs.next()) {
                    Category category = Category.builder()
                            .id(rs.getLong("id"))
                            .name(rs.getString("name"))
                            .imageName(rs.getString("imageName"))
                            .build();
                    categories.add(category);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return categories;
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
