package springbootexample.repositories;

import springbootexample.entities.Product;
import java.util.List;

public interface ProductRepository extends BaseRepository<Product> {

    Product findById(int id);

    List<Product> findAllByCategoryId(int categoryId);
}
