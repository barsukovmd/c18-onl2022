package by.tms.onlinestore.controller;

import by.tms.onlinestore.model.PagesPath;
import jakarta.servlet.http.HttpServletRequest;

public interface BaseCommandController {

    PagesPath execute(HttpServletRequest request) throws Exception;
}


