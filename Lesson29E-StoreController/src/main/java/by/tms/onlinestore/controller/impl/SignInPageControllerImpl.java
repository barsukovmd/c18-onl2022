package by.tms.onlinestore.controller.impl;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.model.PagesPath;
import jakarta.servlet.http.HttpServletRequest;

public class SignInPageControllerImpl implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        PagesPath path;
        path = PagesPath.SIGN_IN_PAGE;
        return path;
    }
}

