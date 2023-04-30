package springbootexample.repositories;

import springbootexample.entities.Category;

public interface CategoryRepository extends BaseRepository<Category> {

    Category findById(int id);
}
