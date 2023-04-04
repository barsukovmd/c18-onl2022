package tms.controller.impl;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.PagesPath;

import static tms.model.PagesPath.LOGIN_PAGE;


@Setter
public class CreateUserPageCommandController implements CommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        return LOGIN_PAGE;
    }
}