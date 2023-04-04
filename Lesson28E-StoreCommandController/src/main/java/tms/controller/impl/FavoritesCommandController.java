package tms.controller.impl;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import org.apache.commons.lang3.tuple.Pair;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.Inject;
import tms.model.PagesPath;
import tms.model.Product;
import tms.service.*;

import java.util.List;
import java.util.stream.Collectors;

import static tms.model.PagesPath.FAVORITES_JSP_PAGE;
import static tms.utils.Constants.Attributes.FAVORITE_PRODUCTS;
import static tms.utils.ServletUtils.getLogin;

@Setter
public class FavoritesCommandController implements CommandController {

    @Inject
    private CartService cartService;
    @Inject
    private UserService userService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        String login = getLogin(request);
        Long userId = userService.getUserId(login);
        List<Product> favoriteProducts = cartService.getProductsFromCart(userId, false, true).stream()
                .map(Pair::getLeft)
                .collect(Collectors.toList());
        request.getServletContext().setAttribute(FAVORITE_PRODUCTS, favoriteProducts);
        return FAVORITES_JSP_PAGE;
    }
}