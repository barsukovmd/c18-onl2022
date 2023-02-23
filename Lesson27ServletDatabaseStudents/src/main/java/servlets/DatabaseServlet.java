package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Students;
import service.StudentService;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/students-database")
public class DatabaseServlet extends HttpServlet {
    private StudentService studentService;
    private String message;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        studentService = (StudentService) servletConfig.getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        List<Students> students = studentService.searchStudents();
        request.setAttribute("students", students);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/student-form.jsp");
        requestDispatcher.forward(request, response);
    }


    public void destroy() {
        message = "Database destroy";
    }
}