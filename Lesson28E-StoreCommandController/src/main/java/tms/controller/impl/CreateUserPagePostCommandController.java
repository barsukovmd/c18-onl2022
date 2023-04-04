package tms.controller.impl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.Inject;
import tms.model.PagesPath;
import tms.model.User;
import tms.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

import static tms.model.PagesPath.FAIL_REGISTER_PAGE;
import static tms.model.PagesPath.SUCCESS_REGISTER_PAGE;
import static tms.utils.Constants.Attributes.INVALID;
import static tms.utils.Constants.RequestParameters.*;
import static tms.utils.ControllerUtils.getUser;
import static tms.utils.ServletUtils.saveUserSession;
import static tms.utils.ValidatorUtils.isVerifyUserData;

@Setter
public class CreateUserPagePostCommandController implements CommandController {

    @Inject
    private UserService userService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        String login = request.getParameter(LOGIN);
        String verifyPassword = request.getParameter(VERIFY_PASSWORD);
        User user = getUser(request, login);
        List<String> errorMessages = isVerifyUserData(user);
        checkUniqueUser(verifyPassword, user, errorMessages);
        PagesPath path;
        if (errorMessages.isEmpty()) {
            userService.addUser(user);
            saveUserSession(request, login);
            path = SUCCESS_REGISTER_PAGE;
        } else {
            request.setAttribute(INVALID, errorMessages.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(". ")));
            path = FAIL_REGISTER_PAGE;
        }
        return path;
    }

    private void checkUniqueUser(String verifyPassword, User user, List<String> errorMessages) {
        if (!isNewUserVerify(user.getLogin(), user.getPassword(), verifyPassword)) {
            errorMessages.add("This user already exist");
        }
    }

    private boolean isNewUserVerify(String login, String password, String verifyPassword) {
        if (userService.getUserByLogin(login) == null) {
            return password.equals(verifyPassword);
        }
        return false;
    }
}