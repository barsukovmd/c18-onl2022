package controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

public interface BaseController {
    String execute(HttpServletRequest request) throws Exception;
}
