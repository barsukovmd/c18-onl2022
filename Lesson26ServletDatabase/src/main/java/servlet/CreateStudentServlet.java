package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.City;
import model.Students;
import service.StudentService;

import java.io.IOException;

@WebServlet("/create")
public class CreateStudentServlet extends HttpServlet {
    private StudentService studentService;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init();
        studentService = (StudentService) servletConfig.getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/createStudent.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int idForCity = Integer.parseInt(req.getParameter("id_for_city"));
            String city = req.getParameter("city");
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            String surname = req.getParameter("surname");
            int age = Integer.parseInt(req.getParameter("age"));
            int course = Integer.parseInt(req.getParameter("course"));
            studentService.insertNewStudents(new Students(id, name, surname, age, course, new City(idForCity, city)));
            resp.sendRedirect(req.getContextPath() + "/students-database");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage() + "exception");
            doGet(req, resp);
        }
    }
}
