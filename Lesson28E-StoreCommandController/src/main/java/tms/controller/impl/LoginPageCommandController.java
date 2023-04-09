package tms.controller.impl;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.Setter;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.PagesPath;

import static tms.model.PagesPath.LOGIN_JSP_PAGE;
import static tms.utils.Constants.Attributes.ACCESS_PERMISSION;
import static tms.utils.ControllerUtils.getHomePagePath;

@Setter
public class LoginPageCommandController implements CommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession();
        PagesPath path;
        if (session.getAttribute(ACCESS_PERMISSION) != null) {
            path = getHomePagePath();
        } else {
            path = LOGIN_JSP_PAGE;
        }
        return path;
    }
}