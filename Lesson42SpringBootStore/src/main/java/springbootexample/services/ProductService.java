package springbootexample.services;

import springbootexample.entities.Product;
import java.util.List;
import org.springframework.web.servlet.ModelAndView;

public interface ProductService extends BaseService<Product> {

    List<Product> getAllForCategory(int categoryId);

    ModelAndView getProductData(int id);
}
