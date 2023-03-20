package controller;

import jakarta.servlet.http.HttpServletRequest;
import models.User;
import service.CategoryServiceImpl;

public class HomeController implements BaseController {
    private final CategoryServiceImpl categoryService = new CategoryServiceImpl();

    @Override
    public String execute(HttpServletRequest request) throws Exception {
        if (request.getMethod().equalsIgnoreCase("GET")) {
            User user = (User) request.getSession().getAttribute("username");
            return chechReceivedUser(user, request);
        } else {
            String login = request.getParameter("username");
            String password = request.getParameter("password");
        }
    }
}
