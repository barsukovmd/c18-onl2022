package by.tms.onlinestore.servlet;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.model.Commands;
import by.tms.onlinestore.model.PagesPath;
import by.tms.onlinestore.model.RequestParam;
import by.tms.onlinestore.utils.CommandControllerFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/eshop")
public class ApplicationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String commandKey = request.getParameter(RequestParam.COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = Commands.SIGN_IN_COMMAND.getCommand();
        }
        try {
            BaseCommandController baseController = CommandControllerFactory.defineCommand(Commands.fromString(commandKey));
            PagesPath pagesPath = baseController.execute(request);
            RequestDispatcher dispatcher = request.getRequestDispatcher(pagesPath.getPath());
            dispatcher.forward(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            request.getRequestDispatcher(PagesPath.SIGN_IN_PAGE.getPath()).forward(request, response);
        }
    }
}



