package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.model.SpringHelloWorld;
import spring.model.User;

public class SpringHelloWorldRunner {

    public static void main(String[] args) throws Exception {
        User user = new User("Ivan");
        System.out.println(user);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-bean.xml");
        try (context) {
            SpringHelloWorld helloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
            System.out.println(helloWorld.getHelloMessage());
            JsonMarshaller jsonMarshaller = context.getBean("jsonMarshaller", JsonMarshaller.class);
            String body = jsonMarshaller.marshal(new User("Ivan"));
            System.out.println(body);
            System.out.println(jsonMarshaller.unmarshal(body));
        }
    }
}
