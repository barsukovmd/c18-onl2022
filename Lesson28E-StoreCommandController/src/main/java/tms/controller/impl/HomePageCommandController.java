package tms.controller.impl;

import by.tms.controller.CommandController;
import by.tms.exception.CommandException;
import by.tms.model.PagesPath;

import javax.servlet.http.HttpServletRequest;

import static by.tms.utils.ControllerUtils.getHomePagePath;

public class HomePageCommandController implements CommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        return getHomePagePath();
    }
}