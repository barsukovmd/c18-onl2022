package tms.controller.impl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import org.apache.commons.lang3.tuple.Pair;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.Inject;
import tms.model.PagesPath;
import tms.model.Product;
import tms.service.CartService;
import tms.service.UserService;

import java.util.List;

import static tms.model.PagesPath.SHOPPING_CART_JSP_PAGE;
import static tms.utils.Constants.Attributes.*;


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