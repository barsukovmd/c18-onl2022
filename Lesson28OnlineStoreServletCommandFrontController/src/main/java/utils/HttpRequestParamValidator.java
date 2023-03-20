package utils;

import exception.ValidationException;

import java.util.Optional;

public class HttpRequestParamValidator {
    private static final String REQUEST_PARAMETER_IS_NULL_ERROR = "Request parameter is not initialized!";

    public static void validateParametersNotNull(String parameters) throws ValidationException {
        if (Optional.ofNullable(parameters).isEmpty()) {
            throw new ValidationException(REQUEST_PARAMETER_IS_NULL_ERROR);
        }
    }
}
