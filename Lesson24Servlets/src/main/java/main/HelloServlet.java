package main;

import java.io.*;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/my-servlet2023")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello Java Developer";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.setContentType("int/html");
        RequestDispatcher dispatcherType = request.getRequestDispatcher("/myFirstJsp");
        dispatcherType.forward(request, response);
    }

    public void destroy() {
        super.destroy();
        System.out.println("destroy");
    }
}