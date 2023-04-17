package test;

import com.mysql.cj.jdbc.MysqlDataSource;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
        Environment env = ctx.getEnvironment();
        String databaseUrl = env.getProperty("database.url"); // (2)
        boolean containsPassword = env.containsProperty("database.password");
        System.out.println(env);
        //если хотим создать свой класс в xml, то создаем через
        //ApplicationContext context = new ClassPathXmlApplicationContext();
        //context.getBean("");
        UserDao userDao = ctx.getBean(UserDao.class);
//        test.User user1 = userDao.findById(1);
//        test.User user2 = userDao.findById(2);
        DataSource dataSource = ctx.getBean(DataSource.class);
    }

}
