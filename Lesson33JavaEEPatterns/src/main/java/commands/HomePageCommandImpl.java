package commands;

import exceptions.CommandException;
import jakarta.servlet.http.HttpServletRequest;
import model.PagesPath;

public class HomePageCommandImpl implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        return PagesPath.HOME_PAGE.getPath();
    }
}

