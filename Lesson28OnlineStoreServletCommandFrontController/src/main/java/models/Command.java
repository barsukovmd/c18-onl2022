package models;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Command {
    LOGOUT_COMMAND("logout"),
    SIGN_IN_COMMAND("sign-in");
    private static final Map<String, Command> commandMapping = new HashMap<>();

    static {
        for (Command type : values()) {
            commandMapping.put(type.getCommand(), type);
        }
    }

    public static Command fromString(String type) {
        return Optional.ofNullable(commandMapping.get(type))
                .orElseThrow(() -> new IllegalStateException("Unknown command type"));
    }

    private final String command;

    Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
