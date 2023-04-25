package testMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@Controller similar to @Component, but has more functionality
//@RequestMapping(/home) provides start point for mapping(if it has),
//then other @GetMapping(/cart) will add additional map (/home/cart)
@RequestMapping("/home")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage() {
        return "Hello world!";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "Goodbye world!";
    }
}
