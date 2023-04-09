package tms.controller.impl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.PagesPath;
import tms.model.User;

import static tms.utils.Constants.Attributes.*;
import static tms.utils.ControllerUtils.getHomePagePath;


@Slf4j
public class LogoutPageCommandController implements CommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        HttpSession session = request.getSession(false);
        User user = (User) session.getAttribute(ACCESS_PERMISSION);
        String userUUID = (String) session.getAttribute(USER_UUID);
        log.info("User [" + userUUID + "] with a login " + user.getLogin() + " logged out of the system");
        session.removeAttribute(ACCESS_PERMISSION);
        session.removeAttribute(USER_UUID);
        session.invalidate();
        return getHomePagePath();
    }
}