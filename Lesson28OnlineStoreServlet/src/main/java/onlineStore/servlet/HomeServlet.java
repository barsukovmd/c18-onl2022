package onlineStore.servlet;

import onlineStore.exceptions.*;
import onlineStore.model.*;
import onlineStore.service.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.*;

import static onlineStore.utils.HttpRequestParamValidator.*;
import static onlineStore.utils.Utils.*;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    private CategoryServiceAware categoryService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        categoryService = (CategoryService) config.getServletContext().getAttribute("categoryService");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("username");
        checkReceivedUser(user, request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("username");
        String pass = request.getParameter("password");
        User user;
        Cart cart;
        try {
            validateParamNotNull(login);
            validateParamNotNull(pass);
            user = new User(ADMIN_LOGIN, ADMIN_PASSWORD);
            cart = new Cart();
            request.getSession().setAttribute("cart", cart);
            request.getSession().setAttribute("username", user);
            checkReceivedUser(user, request, response);

        } catch (RequestParamNullException e) {
            System.out.println(e.getMessage());
        }
    }

    private void checkReceivedUser(User user, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (isUserLogIn(user)) {
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("signing.jsp");
            requestDispatcher.forward(request, response);
        }
    }
}
