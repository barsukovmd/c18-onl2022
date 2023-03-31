package controller.impl;

import controller.BaseController;
import jakarta.inject.Inject;
import jakarta.servlet.http.HttpServletRequest;
import models.PagesPath;
import models.User;
import service.impl.UserService;

import static models.RequestParameters.LOGIN;
import static models.RequestParameters.PASSWORD;

public class SignInPagePost implements BaseController {
    @Inject
    private UserService userService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        String username = request.getParameter(LOGIN.getInfo());
        String pass = request.getParameter(PASSWORD.getInfo());
        return
    }
}
