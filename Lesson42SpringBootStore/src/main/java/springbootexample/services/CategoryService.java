package springbootexample.services;

import springbootexample.entities.Category;
import org.springframework.web.servlet.ModelAndView;

public interface CategoryService extends BaseService<Category> {

    ModelAndView getCategoryData(int id);
}
