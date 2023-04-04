package tms.controller.impl;

import by.tms.controller.CommandController;
import by.tms.exception.CommandException;
import by.tms.model.PagesPath;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;

import static by.tms.model.PagesPath.LOGIN_PAGE;

@Setter
public class CreateUserPageCommandController implements CommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        return LOGIN_PAGE;
    }
}