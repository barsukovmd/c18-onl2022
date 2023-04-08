package by.tms.onlinestore.listener;

import by.tms.onlinestore.repository.utils.ConnectionPool;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import static by.tms.onlinestore.model.Attribute.CONNECTION_POOL;
import static by.tms.onlinestore.model.Attribute.USER_UUID;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {
        ConnectionPool connectionPool = ConnectionPool.getInstance(); //++
        servletContextEvent.getServletContext().setAttribute(CONNECTION_POOL.getAttribute(), connectionPool);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ConnectionPool.getInstance().closeAllConnection();
        servletContextEvent.getServletContext().removeAttribute(USER_UUID.getAttribute());
    }
}

