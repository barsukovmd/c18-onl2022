package listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import repository.DatabaseRepository;
import repository.StudentsRepository;
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
        String dbUrl = sce.getServletContext().getInitParameter("db_user");
        String dbDriver = sce.getServletContext().getInitParameter("db_driver");
        try {
            Class.forName(dbDriver);
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            StudentsRepository studentsRepository = new DatabaseRepository(connection);
            StudentService studentService = new StudentService(studentsRepository);
            sce.getServletContext().setAttribute("studentService", studentService);
            sce.getServletContext().setAttribute("connection", connection);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
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
