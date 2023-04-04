package tms.controller.impl;

import jakarta.servlet.http.HttpServletRequest;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.PagesPath;

import static tms.utils.ControllerUtils.getHomePagePath;

public class HomePageCommandController implements CommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        return getHomePagePath();
    }
}