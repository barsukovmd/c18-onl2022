import com.mysql.cj.jdbc.MysqlDataSource;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@AllArgsConstructor
@Getter
@Setter
public class Users {
    private String login;
    private String pass;
    private String description;
    private int id;

    public Users findById(Integer id) {
        try (Connection connection = dataSource.getConnection()) {
//            Statement statement = connection.createStatement("select * from users where id =  ?");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users order by id");
            return users;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Users findByName(Integer id) {
        try (Connection connection = dataSource.getConnection()) {
//            Statement statement = connection.createStatement("select * from users where id =  ?");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users order by name");
            return users;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public DataSource newDataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("s3cr3t");
        dataSource.setURL("jdbc:mysql://localhost:3306/myDatabase");
        return dataSource;
    }
}
