package controller.impl;

import controller.BaseController;
import jakarta.inject.Inject;
import jakarta.servlet.http.HttpServletRequest;
import models.PagesPath;

import static models.PagesPath.*;

public class SignInPageGetImpl implements BaseController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        PagesPath path;
        path = SIGNIN_PAGE;
        return path;
    }
}
