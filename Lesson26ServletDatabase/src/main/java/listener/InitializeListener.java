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
        String username = sce.getServletContext().getInitParameter("postgres");
        String password = sce.getServletContext().getInitParameter("Barsukov28071992");
        String db_url = sce.getServletContext().getInitParameter("jdbc:postgresql://localhost:5432/c18-onl2022");
        String db_driver = sce.getServletContext().getInitParameter("org.postgresql.Driver");
        try {
            Class.forName(db_driver);
            Connection connection = DriverManager.getConnection(db_url, username, password);
            StudentsRepository studentsRepository = new DatabaseRepository(connection);
            StudentService studentService = new StudentService(studentsRepository);
            sce.getServletContext().setAttribute("userService", studentService);
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
