package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class LoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter! Start. The caller IP is " + request.getLocalAddr());
        try {
            chain.doFilter(request, response);
        } catch (ServletException servletException) {
            System.out.println(servletException.getMessage() + "exception in servlet");
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
