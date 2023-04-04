package tms.controller.impl;


import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.Inject;
import tms.model.PagesPath;
import tms.service.UserService;

import static tms.model.PagesPath.LOGIN_JSP_PAGE;
import static tms.utils.Constants.RequestParameters.*;
import static tms.utils.ControllerUtils.getHomePagePath;
import static tms.utils.ServletUtils.saveUserSession;

@Setter
public class LoginPagePostCommandController implements CommandController {

    @Inject
    private UserService userService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        String login = request.getParameter(NAME);
        String password = request.getParameter(PASSWORD);
        PagesPath path;
        if (userService.isVerifiedUser(login, password)) {
            saveUserSession(request, login);
            path = getHomePagePath();
        } else {
            path = LOGIN_JSP_PAGE;
        }
        return path;
    }
}