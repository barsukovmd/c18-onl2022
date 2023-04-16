import javax.sql.DataSource;

public class UserDao {

    public UserDao(DataSource dataSource) {
    }

    public User findById(int id) {
        return new User();
    }
}
