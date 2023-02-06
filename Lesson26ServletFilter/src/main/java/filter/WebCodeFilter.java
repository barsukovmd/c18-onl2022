package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

//@WebServlet(urlPatterns = "/*",
//        initParams = {@WebInitParam(name = "encoding", value = "UTF-8", description = "Encoding parameters")})

public class WebCodeFilter implements Filter {
    private String encoding;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encoding = filterConfig.getInitParameter("Encoding init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (!encoding.equals(servletRequest.getCharacterEncoding())) {
            servletRequest.setCharacterEncoding(encoding);
            servletResponse.setCharacterEncoding(encoding);
            servletResponse.setContentType("text/html");
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("Destroy Filter");
        encoding = null;
    }
}
