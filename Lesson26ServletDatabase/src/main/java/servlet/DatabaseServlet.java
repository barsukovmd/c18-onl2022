package servlet;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Students;
import service.StudentService;

@WebServlet(name = "Database Servlet", value = "/students-database")
public class DatabaseServlet extends HttpServlet {
    private String message;
    private StudentService studentService;
    private Map<String, String> hashMap = new ConcurrentHashMap<>();

    public void init(ServletConfig servletConfig) {
        message = "Database init";
        studentService = (StudentService) servletConfig.getServletContext().getAttribute("studentService");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        List<Students> users = studentService.searchStudents();
        request.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/database.jsp").forward(request, response);
//        hashMap.put("1312", "1242");
    }

    public void destroy() {
        message = "Database destroy";
    }
}