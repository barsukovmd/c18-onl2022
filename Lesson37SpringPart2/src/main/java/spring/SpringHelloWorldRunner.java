package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.model.SpringHelloWorld;
import spring.model.User;

public class SpringHelloWorldRunner {

    public static void main(String[] args) {
        try (
                final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                        SpringHelloWorldRunner.class)
        ) {
            User user = new User();
            user.test();

            final SpringHelloWorld helloWorld = context.getBean("springHelloWorld", SpringHelloWorld.class);
            System.out.println(helloWorld.getHelloMessage());
            System.out.println(helloWorld.getTest());
        }
    }

}
