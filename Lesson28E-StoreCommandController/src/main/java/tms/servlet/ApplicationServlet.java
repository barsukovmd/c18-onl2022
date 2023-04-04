package tms.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.Commands;
import tms.model.PagesPath;
import tms.utils.ControllerCommandFactory;

import java.io.IOException;

import static tms.model.Commands.HOME_PAGE_COMMAND;
import static tms.utils.Constants.RequestParameters.COMMAND;
import static tms.utils.ControllerUtils.throwCommandException;
import static tms.utils.ServletUtils.forwardToAddress;

@Slf4j
@WebServlet("/eshop")
public class ApplicationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processRequest(req, resp);
        } catch (CommandException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processRequest(req, resp);
        } catch (CommandException e) {
            throw new RuntimeException(e);
        }
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, CommandException {
        String commandKey = request.getParameter(COMMAND);
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = HOME_PAGE_COMMAND.getCommand();
        }
        try {
            CommandController baseController = ControllerCommandFactory.defineCommand(Commands.fromString(commandKey));
            PagesPath pagesPath = baseController.execute(request);
            forwardToAddress(request, response, pagesPath.getPath());
        } catch (Exception e) {
            throwCommandException(request, e, this.getClass());
            log.error("It is impossible to go to the address", e);
            forwardToAddress(request, response, "/500.jsp");
        }
    }
}