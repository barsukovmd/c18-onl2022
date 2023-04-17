package test;

import jakarta.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    private DataSource dataSource;

    private final String name = "Name";

    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public User findById(int id) {
        return new User();
    }
}
