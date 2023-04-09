package tms.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

import static tms.model.PagesPath.HOME_PAGE;

@WebFilter(urlPatterns = {"/view/navigate.jsp", "/view/bootstrap.jsp"})
public class LockPageFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException, ServletException {
        servletRequest.getServletContext().getRequestDispatcher(HOME_PAGE.getPath()).forward(servletRequest, servletResponse);
    }
}