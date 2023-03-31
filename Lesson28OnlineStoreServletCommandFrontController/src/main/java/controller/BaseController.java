package controller;

import jakarta.servlet.http.HttpServletRequest;
import models.PagesPath;

public interface BaseController {
    PagesPath execute(HttpServletRequest request) throws Exception;
}
