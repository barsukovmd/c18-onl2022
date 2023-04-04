package tms.controller.impl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.*;
import tms.service.OrderService;
import tms.service.UserService;

import java.util.List;

import static tms.model.PagesPath.ACCOUNT_PAGE;
import static tms.utils.Constants.Attributes.ORDERINGS;
import static tms.utils.Constants.Attributes.USER;
import static tms.utils.ServletUtils.getLogin;
import static tms.utils.ServletUtils.getOrderings;

@Setter
public class AccountPageCommandController implements CommandController {

    @Inject
    private UserService userService;
    @Inject
    private OrderService orderService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        String login = getLogin(request);
        User user = userService.getUserByLogin(login);
        request.getServletContext().setAttribute(USER, user);
        Long userId = userService.getUserId(login);
        List<Order> orders = orderService.getOrdersById(userId);
        if (!orders.isEmpty()) {
            List<Ordering> orderings = getOrderings(orders);
            request.getServletContext().setAttribute(ORDERINGS, orderings);
        } else {
            request.removeAttribute(ORDERINGS);
        }
        return ACCOUNT_PAGE;
    }
}