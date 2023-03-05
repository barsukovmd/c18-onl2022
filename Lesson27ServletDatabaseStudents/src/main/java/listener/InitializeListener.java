package listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import repository.StudentDatabase;
import repository.StudentRepositoryAware;
import service.StudentService;
import java.sql.Connection;
import java.sql.DriverManager;

@WebListener
public class InitializeListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Initialize listener");
        String username = sce.getServletContext().getInitParameter("db_user");
        String password = sce.getServletContext().getInitParameter("db_password");
        String url = sce.getServletContext().getInitParameter("db_url");
        String driver = sce.getServletContext().getInitParameter("db_driver");
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            StudentRepositoryAware students = new StudentDatabase(connection);
            StudentService studentService = new StudentService(students);
            sce.getServletContext().setAttribute("studentService", studentService);
            sce.getServletContext().setAttribute("connection", connection);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            Connection connection = (Connection) sce.getServletContext().getAttribute("connection");
            connection.close();
        } catch (Exception e) {
            System.out.println("Error occurred" + e.getMessage());
        }
    }
}
