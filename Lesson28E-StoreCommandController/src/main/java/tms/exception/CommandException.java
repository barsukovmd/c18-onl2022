package tms.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandException extends Exception {

    public CommandException(String message) {
        log.error(message);
    }
}