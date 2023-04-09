package tms.controller.impl;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.Inject;
import tms.model.PagesPath;
import tms.model.Product;
import tms.service.CartService;
import tms.service.OrderService;
import tms.service.UserService;

import java.util.List;

import static tms.model.PagesPath.SHOPPING_CART_PAGE;
import static tms.model.PagesPath.SUCCESS_BUY_JSP_PAGE;
import static tms.utils.Constants.*;
import static tms.utils.ServletUtils.createOrderNumber;
import static tms.utils.ServletUtils.getLogin;


@Setter
public class ShoppingCartPagePostCommandController implements CommandController {

    @Inject
    private OrderService orderService;
    @Inject
    private CartService cartService;
    @Inject
    private UserService userService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
//        if (Constants.BUY.equals(buyButton)) {
        String login = getLogin(request);
        Long userId = userService.getUserId(login);
        PagesPath path;
        String buyButton = request.getParameter(BUY);
        if (buyButton.equals(BUY)) {
            List<Product> products = cartService.getPurchasedProducts(userId, true, false);
            String orderNumber = "";
//            while (!orderService.checkOrderNumber(orderNumber) || orderNumber.equals("")) {
            while (!orderService.checkOrderNumber(orderNumber) || "".equals(orderNumber)) {
                orderNumber = createOrderNumber(userId);
            }
            orderService.createOrder(orderNumber, userId);
            String finalOrderNumber = orderNumber;
            products.forEach(product -> orderService.saveProductInOrderConfigurations(finalOrderNumber, product));
            cartService.deleteCartProductsAfterBuy(userId);
            path = SUCCESS_BUY_JSP_PAGE;
        } else {
            path = SHOPPING_CART_PAGE;
        }
        return path;
    }
}