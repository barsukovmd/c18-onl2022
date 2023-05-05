package springbootexample.controllers;

import static springbootexample.model.EshopConstants.USER;
import static springbootexample.model.PagesPathEnum.SIGN_IN_PAGE;

import springbootexample.entities.User;
import springbootexample.exceptions.AuthorizationException;
import springbootexample.exceptions.ErrorView;
import springbootexample.services.UserService;
import java.util.Objects;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SessionAttributes({USER})
@RequestMapping("/login")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ModelAndView openLoginPage() {
        return new ModelAndView(SIGN_IN_PAGE.getPath());
    }

    @ErrorView(value = "error", status = HttpStatus.FORBIDDEN)
    @PostMapping
    public ModelAndView login(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, ModelAndView modelAndView) throws AuthorizationException, AuthorizationException {
        if (bindingResult.hasErrors()) {
            populateError("email", modelAndView, bindingResult);
            populateError("password", modelAndView, bindingResult);
            modelAndView.setViewName(SIGN_IN_PAGE.getPath());
            return modelAndView;
        }

        return userService.authenticate(user);
    }

    @ModelAttribute(USER)
    public User setUpUserForm() {
        return new User();
    }

    private void populateError(String field, ModelAndView modelAndView, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors(field)) {
            modelAndView.addObject(field + "Error", Objects.requireNonNull(bindingResult.getFieldError(field))
                                                           .getDefaultMessage());
        }
    }
}
