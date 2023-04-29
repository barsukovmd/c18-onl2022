package us.springCourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestMvcController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello world";
    }
}
