package tms.utils;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import tms.model.Order;
import tms.model.Ordering;
import tms.model.Product;
import tms.model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.UUID.randomUUID;
import static tms.utils.Constants.Attributes.*;
import static tms.utils.Constants.CONVERSATION;

@Slf4j
@UtilityClass
public class ServletUtils {

    public static void saveUserSession(HttpServletRequest req, String login) {
        HttpSession session = req.getSession();
        User user = User.builder()
                .login(login)
                .build();
        session.setAttribute(ACCESS_PERMISSION, user);
        log.info("The user with a login " + user.getLogin() + " is logged in");
        session.setAttribute(USER_NAME, login);
        String userUUID = randomUUID().toString();
        MDC.put(CONVERSATION, userUUID);
        session.setAttribute(USER_UUID, userUUID);
        log.info("User with the login " + user.getLogin() + " has been assigned a UUID");
    }

    public static String getLogin(HttpServletRequest req) {
        if (req.getSession().getAttribute(USER_NAME) != null) {
            return req.getSession().getAttribute(USER_NAME).toString();
        } else {
            return null;
        }
    }

    public static List<Ordering> getOrderings(List<Order> orders) {
        List<Ordering> orderings = new ArrayList<>();
        Order singleOrder = orders.get(0);
        List<Product> singleOrderList = new ArrayList<>();
        addOrdering(orderings, singleOrder, singleOrderList);
        separateOrders(orders, orderings, singleOrder, singleOrderList);
        return orderings;
    }

    private void addOrdering(List<Ordering> orderings, Order singleOrder, List<Product> singleOrderList) {
        orderings.add(new Ordering(singleOrder.getId(), singleOrder.getDate(), singleOrderList));
        singleOrderList.add(singleOrder.getProduct());
    }

    private void separateOrders(List<Order> orders, List<Ordering> orderings, Order singleOrder, List<Product> singleOrderList) {
        for (int i = 1; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (singleOrder.getId().equals(order.getId())) {
                singleOrderList.add(order.getProduct());
            } else {
                singleOrder = order;
                singleOrderList = new ArrayList<>();
                addOrdering(orderings, singleOrder, singleOrderList);
            }
        }
    }

    public static String createOrderNumber(Long id) {
        String uuid = randomUUID().toString();
        return "#" + id + "-" + uuid;
    }

    public static void forwardToAddress(HttpServletRequest request, HttpServletResponse response, String address) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }
}