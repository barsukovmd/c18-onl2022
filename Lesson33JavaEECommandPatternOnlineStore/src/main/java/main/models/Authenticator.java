package main.models;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Authenticator {
    private Map<String, String> authenticators;

}
