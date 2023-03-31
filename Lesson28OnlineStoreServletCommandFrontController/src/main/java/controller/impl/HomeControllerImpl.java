package controller.impl;

import controller.BaseController;
import dto.UserDto;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import models.Category;
import models.PagesPath;
import models.User;
import service.CategoryServiceAware;
import service.impl.CategoryServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static models.PagesPath.*;
import static utils.Utils.isVerifiedLogin;

public class HomeControllerImpl implements BaseController {
    @Inject
    private CategoryServiceAware categoryServiceAware;

    @Override
    public PagesPath execute(HttpServletRequest request) throws ServletException, Exception {
        UserDto userDto = (UserDto) request.getSession().getAttribute("UserDto");
        return checkReceivedUser(userDto, request);
    }

    private PagesPath checkReceivedUser(UserDto userDto, HttpServletRequest request) {
        PagesPath pagesPath;
        if (isVerifiedLogin(userDto)) {
            List<Category> categories = categoryServiceAware.getCategories();
            request.setAttribute("categories", categories);
//request.getRequestDispatcher("home.jsp").forward(request);
            pagesPath = HOME_PAGE;
        } else {
            System.out.println("checkReceivedUser bad, forward to sign-in");
            return pagesPath = SIGNING_PAGE;
        }
        return pagesPath;
    }
}
