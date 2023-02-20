package servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.StudentService;

import java.io.IOException;
@WebServlet("/delete")
public class DeleteStudentServlet extends HttpServlet {
    private StudentService studentService;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        studentService = (StudentService) getServletContext().getAttribute("studentService");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/deleteStudent.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            studentService.deleteStudents(id);
            resp.sendRedirect(req.getContextPath() + "/students-database");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage() + "exception");
            doGet(req, resp);
        }
    }
}
