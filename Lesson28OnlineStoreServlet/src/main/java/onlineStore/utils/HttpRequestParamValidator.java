package onlineStore.utils;

import onlineStore.exceptions.RequestParamNullException;

import java.util.Optional;

public class HttpRequestParamValidator {

    private static final String REQUEST_PARAMETER_IS_NULL_ERROR = "Request parameter is not initialized!";

    public static void validateParamNotNull(String param) throws RequestParamNullException {
        if (Optional.ofNullable(param).isEmpty()) {
            throw new RequestParamNullException(REQUEST_PARAMETER_IS_NULL_ERROR);
        }
    }
}
