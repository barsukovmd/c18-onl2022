package utils;

import controller.BaseController;
import controller.impl.HomeControllerImpl;
import controller.impl.LogoutControllerImpl;
import jakarta.servlet.http.HttpServletRequest;
import models.Command;
import models.RequestParameters;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static final Map<String, BaseController> COMMANDS = new HashMap<>();

    public static BaseController defineCommand(HttpServletRequest request) {
        String commandKey = request.getParameter(RequestParameters.COMMAND.getInfo());
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = Command.SIGN_IN_COMMAND.getCommand();
        }
        return COMMANDS.putIfAbsent(commandKey, createController(Command.fromString(commandKey)));
    }

    private static BaseController createController(Command command) {
        return switch (command) {
            case SIGN_IN_COMMAND -> new HomeControllerImpl();
            case LOGOUT_COMMAND -> new LogoutControllerImpl();
        };
    }
}
