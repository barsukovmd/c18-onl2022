package springbootexample.services;

import springbootexample.entities.User;
import springbootexample.exceptions.AuthorizationException;
import org.springframework.web.servlet.ModelAndView;

public interface UserService extends BaseService<User> {

    ModelAndView authenticate(User user) throws AuthorizationException;

}
