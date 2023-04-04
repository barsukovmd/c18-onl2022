package tms.controller;

import jakarta.servlet.http.HttpServletRequest;
import tms.exception.CommandException;
import tms.model.PagesPath;

public interface CommandController {
    PagesPath execute(HttpServletRequest request) throws CommandException;
}