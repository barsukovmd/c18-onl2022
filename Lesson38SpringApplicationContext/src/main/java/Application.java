import com.mysql.cj.jdbc.MysqlDataSource;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
        //если хотим создать свой класс, то создаем через
        //ApplicationContext context = new ClassPathXmlApplicationContext();
        //context.getBean("");
        UserDao userDao = ctx.getBean(UserDao.class);
//        User user1 = userDao.findById(1);
//        User user2 = userDao.findById(2);
        DataSource dataSource = ctx.getBean(DataSource.class);
    }

    @Configuration
    public class MyApplicationContextConfiguration {  // (1)

        @Bean
        public DataSource dataSource() {  // (2)
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("s3cr3t");
            dataSource.setURL("jdbc:mysql://localhost:3306/myDatabase");
            return dataSource;
        }

        @Bean
        public UserDao userDao() { // (3)
            return new UserDao(dataSource());
        }

    }
}
