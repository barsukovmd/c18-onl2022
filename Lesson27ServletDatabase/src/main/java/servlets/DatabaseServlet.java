package servlets;

import java.io.*;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Students;
import service.StudentService;

@WebServlet(value = "/students-database")
public class DatabaseServlet extends HttpServlet {
    private StudentService studentService;
    private String message;

    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        studentService = (StudentService) servletConfig.getServletContext().getAttribute("studentService");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        List<Students> students = studentService.searchStudents();
        request.setAttribute("students", students);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/start-page.jsp");
        requestDispatcher.forward(request, response);
    }

    public void destroy() {
        message = "Database destroy";
    }
}