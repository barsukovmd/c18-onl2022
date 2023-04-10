package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.model.SpringHelloWorld;
import spring.model.User;
import test.JsonMarshaller;

public class SpringHelloWorldRunner {

    public static void main(String[] args) throws Exception {

//        SpringHelloWorld world = new SpringHelloWorld("sdfsdf");
//        System.out.println(world.getHelloMessage());
        User user = new User("Ivan");
        System.out.println(user);

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-bean.xml")) {
            SpringHelloWorld helloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
            System.out.println(helloWorld.getHelloMessage());
            JsonMarshaller jsonMarshaller = context.getBean("jsonMarshaller", JsonMarshaller.class);
            String body = jsonMarshaller.marshal(new User("Ivan"));
            System.out.println(body);
            System.out.println(jsonMarshaller.unmarshal(body));
        }
    }
}
