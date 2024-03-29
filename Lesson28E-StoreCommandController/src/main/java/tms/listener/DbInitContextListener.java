package tms.listener;


import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import lombok.extern.slf4j.Slf4j;
import tms.model.Commands;
import tms.repository.ConnectionPool;
import tms.utils.ControllerCommandFactory;

import static tms.utils.Constants.Attributes.USER_UUID;

@WebListener
@Slf4j
public class DbInitContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        for (Commands command : Commands.values()) {
            try {
                ControllerCommandFactory.defineCommand(command);
            } catch (Exception e) {
                log.error("Can not put values in commands map", e);
            }
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ConnectionPool.getInstance().closeAllConnection();
        sce.getServletContext().removeAttribute(USER_UUID);
    }
}