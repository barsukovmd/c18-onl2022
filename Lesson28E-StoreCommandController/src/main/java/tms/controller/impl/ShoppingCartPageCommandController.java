package tms.controller.impl;

import by.tms.controller.CommandController;
import by.tms.exception.CommandException;
import by.tms.model.Inject;
import by.tms.model.PagesPath;
import by.tms.model.Product;
import by.tms.service.CartService;
import by.tms.service.UserService;
import lombok.Setter;
import org.apache.commons.lang3.tuple.Pair;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static by.tms.model.PagesPath.SHOPPING_CART_JSP_PAGE;
import static by.tms.utils.Constants.Attributes.*;

@Setter
public class ShoppingCartPageCommandController implements CommandController {

    @Inject
    private CartService cartService;
    @Inject
    private UserService userService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        String login = request.getSession().getAttribute(USER_NAME).toString();
        Long userId = userService.getUserId(login);
        List<Pair<Product, Integer>> cartProducts = cartService.getProductsFromCart(userId, true, false);
        request.getServletContext().setAttribute(CART_PRODUCTS, cartProducts);
        request.getServletContext().setAttribute(FULL_PRICE, cartService.getProductsPrice(cartProducts));
        return SHOPPING_CART_JSP_PAGE;
    }
}