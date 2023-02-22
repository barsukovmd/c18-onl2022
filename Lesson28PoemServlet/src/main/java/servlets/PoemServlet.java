package servlets;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//*1) Клиент при обращении к серверу получает случайно выбранное стихотворение
// Максима Богдановича из файла.

@WebServlet(value = "/poem")
public class PoemServlet extends HttpServlet {

    public void init() throws ServletException {
        super.init();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try {
            File file = new File("src/main/resources/poemsByBogdanovich");
            if (file.canRead()) {
                new String(getServletContext().getResourceAsStream("src/main/resources/poemsByBogdanovich" + ".txt").readAllBytes());
            } else {

            }
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "error");
        }
    }

    public void destroy() {
        super.destroy();
    }
}