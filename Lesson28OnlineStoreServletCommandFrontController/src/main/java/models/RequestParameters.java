package models;

import lombok.Getter;

@Getter
public enum RequestParameters {
    LOGIN("Login"),
    PASSWORD("Password"),
    COMMAND("Command");
    private final String info;

    RequestParameters(String info) {
        this.info = info;
    }
}
