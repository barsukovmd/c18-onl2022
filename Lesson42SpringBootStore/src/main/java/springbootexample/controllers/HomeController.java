package springbootexample.controllers;

import static springbootexample.model.PagesPathEnum.START_PAGE;
import static springbootexample.model.RequestParamsEnum.POPULAR_CATEGORIES_LIST_REQ_PARAM;

import springbootexample.entities.Category;
import springbootexample.services.CategoryService;
import java.util.List;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final CategoryService categoryService;

    public HomeController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping()
    public ModelAndView getHomePage(/*@SessionAttribute(USER) User user*/) {
//        System.out.println("User with email: " + user.getEmail() + " and password: " + user.getPassword() + " successfully logged in!");
        ModelMap model = new ModelMap();

        List<Category> categoriesList = categoryService.read();

        model.addAttribute(POPULAR_CATEGORIES_LIST_REQ_PARAM.getValue(), categoriesList);

        return new ModelAndView(START_PAGE.getPath(), model);
    }

}
