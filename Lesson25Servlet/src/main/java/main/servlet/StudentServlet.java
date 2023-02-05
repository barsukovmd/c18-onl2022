package main.servlet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import main.model.Student;

// 1. Создать страницу логина с формой ввода имени пользователя и пароля.
// 2. Создать сервлет для обработки формы логина и определения пользователя
// (можно использовать предустановленные значения имени и пароля, в БД нет необходимости).
//пункты 1 и 2 уже реализованы, можно взять за основу в моем репозитории!
// 3. Создать защищенную страницу, попасть на которую можно только после логина.
// 4. Все запросы к защищенной странице должны приводить к перенаправлению на страницу логина,
// если пользователь еще не залогинен, а если залогинен – должны всегда быть успешными.
@WebServlet(name = "Student Servlet", value = "/students")
public class StudentServlet extends HttpServlet {
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alex", 20, 4));
        studentList.add(new Student("George", 25, 3));
        studentList.add(new Student("Michale", 19, 4));
        studentList.add(new Student("Mi", 24, 2));
        studentList.add(new Student("Yo", 22, 3));
        studentList.add(new Student("Ronaldo", 24, 1));
        request.setAttribute("data", studentList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("students.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    public void destroy() {
        super.destroy();
        System.out.println("destroy");
    }
}