package utils;

import commands.BaseCommand;
import commands.HomePageCommandImpl;
import jakarta.servlet.http.HttpServletRequest;
import model.Commands;
import model.RequestParams;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private static final Map<String, BaseCommand> COMMAND_LIST = new HashMap<>();

    static {
        COMMAND_LIST.put(Commands.HOME_PAGE_COMMAND.getCommand(), new HomePageCommandImpl());
//        COMMAND_LIST.put(Commands.SIGN_IN_COMMAND.getCommand(), new SignInCommandImpl());
//        COMMAND_LIST.put(Commands.SIGN_IN_COMMAND.getCommand(), new HomeController());

    }

    public static BaseCommand defineCommand(HttpServletRequest request) {
        String commandKey = request.getParameter(RequestParams.COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = Commands.SIGN_IN_COMMAND.getCommand();
        }
        return COMMAND_LIST.get(commandKey);
    }

}

