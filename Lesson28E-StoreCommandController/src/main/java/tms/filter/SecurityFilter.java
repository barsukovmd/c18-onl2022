package tms.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import static tms.model.PagesPath.HOME_PAGE;
import static tms.utils.Constants.Attributes.ACCESS_PERMISSION;

@WebFilter(urlPatterns = {"/view/success-buy.jsp", "/view/favorites.jsp",
        "/view/favorites", "/view/shopping-cart.jsp", "/view/shopping-cart",
        "/view/success-register.jsp", "/view/success-register",
        "/add-cart", "/add-favorite", "/delete-favorite",
        "/delete-cart-product", "/view/account.jsp",
        "/view/account", "/account",})
public class SecurityFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpSession session = req.getSession();
        if (session.getAttribute(ACCESS_PERMISSION) == null) {
            RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher(HOME_PAGE.getPath());
            requestDispatcher.forward(servletRequest, servletResponse);
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}