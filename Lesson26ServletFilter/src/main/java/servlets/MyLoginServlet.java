package servlets;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.User;

@WebServlet(name = "MyLoginServlet", value = "/login")
public class MyLoginServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        HttpSession session = req.getSession();
        session.setAttribute("login", login);
        session.setAttribute("password", password);
        String path = req.getContextPath() + "/home";
        resp.sendRedirect(path);
        System.out.println(login + " " + password);
        resp.setContentType("text/plain");
        if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
            resp.getWriter().write("Success logged!!");
        } else {
            resp.getWriter().println("Password is not correct");
        }
    }
}