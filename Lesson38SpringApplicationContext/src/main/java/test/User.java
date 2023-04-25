package test;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.springframework.stereotype.Component;

@Component

public class User {

    ObjectMapper objectMapper = new ObjectMapper();
    ConcurrentMap concurrentMap = new ConcurrentHashMap();
}
