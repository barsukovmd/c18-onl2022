package commands;

import exceptions.CommandException;
import jakarta.servlet.http.HttpServletRequest;

public interface BaseCommand {

    String execute(HttpServletRequest request) throws CommandException;
}


