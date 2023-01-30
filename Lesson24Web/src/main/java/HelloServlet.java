import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Calculator;

@WebServlet(name = "HelloServlet", value = "/my-servlet2023")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Welcome to you first Servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Calculator calculator = new Calculator();
        calculator.sum(2, 5);
        calculator.subtraction(10, 5);
        calculator.division(100, 101);
        calculator.multiply(10, 50);
    }

    public void destroy() {
    }
}