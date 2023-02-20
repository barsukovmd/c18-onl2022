package servlet;

import java.io.*;
import java.util.List;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.City;
import model.Students;
import service.StudentService;
//Создать страницу добавления студентов в базу данных.
//т.е на jsp странице должна быть форма(form) с полями для ввода и вы смогли их заполнить, нажать кнопку добавить и данные добавились в базу данных.
//Также обязательно подключить стили css к нашим всем страницам(login, students, home, add_student), добавляем гугл ширфтры и визуальности нашим формам по своему усмотрению.
//Логика будет такая с login формы мы попадаем на страницу home где можно сделать 2 сылки (посмотреть всех студентов и добавить студента, также на каждой странице должна быть сылка вернуться на страницу home).
//Также добавить нужные сервлеты, фильтры и листнеры из предыдущих домашек.

@WebServlet("/students-database")
public class DatabaseServlet extends HttpServlet {
    private String message;
    private StudentService studentService;

    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        studentService = (StudentService) servletConfig.getServletContext().getAttribute("studentService");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        List<Students> students = studentService.searchStudents();
        request.setAttribute("students", students);
        getServletContext().getRequestDispatcher("/start-page.jsp").forward(request, response);
    }
    public void destroy() {
        message = "Database destroy";
    }
}