package by.tms.onlinestore.repository.impl;

import by.tms.onlinestore.model.Category;
import by.tms.onlinestore.repository.CategoryRepository;
import by.tms.onlinestore.repository.utils.ConnectionWrapper;
import lombok.AllArgsConstructor;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class CategoryRepositoryImpl implements CategoryRepository {

    private static final String PATH_TO_STORE_ALL_CATEGORIES = "SELECT * FROM \"online-store\".categories";
    private static final String PATH_TO_STORE_CATEGORY_BY_NAME = "SELECT * FROM \"online-store\".categories order by name";
    private static final String PATH_TO_STORE_CATEGORY_BY_ID = "SELECT * FROM \"online-store\".categories order by id";


    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             Statement statement = connectionWrapper.getConnection().createStatement()) {
            ResultSet rs = statement.executeQuery(PATH_TO_STORE_ALL_CATEGORIES);
            while (rs.next()) {
                Category category = Category.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .imageName(rs.getString("imageName"))
                        .build();
                categories.add(category);
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return categories;
    }

    @Override
    public Category getCategoryById(int id) {
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             Statement statement = connectionWrapper.getConnection().createStatement()) {
            ResultSet resultSet = statement.executeQuery(PATH_TO_STORE_CATEGORY_BY_ID);
            while (resultSet.next()) {
                Category category = Category.builder()
                        .id(resultSet.getInt("id"))
                        .build();
                category.setName(category.getName());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Category.builder().id(id).build();
    }

    @Override
    public Category getCategoryByName(String name) {
        try (ConnectionWrapper connectionWrapper = getConnectionWrapper();
             Statement statement = connectionWrapper.getConnection().createStatement()) {
            ResultSet resultSet = statement.executeQuery(PATH_TO_STORE_CATEGORY_BY_NAME);
            while (resultSet.next()) {
                Category category = Category.builder()
                        .name(resultSet.getString("name"))
                        .build();
                category.setName(category.getName());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Category.builder().name(name).build();
    }
}