package tms.controller.impl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.Inject;
import tms.model.PagesPath;
import tms.service.CartService;
import tms.service.ProductService;
import tms.service.UserService;
import java.util.Objects;

import static tms.model.PagesPath.*;
import static tms.utils.Constants.RequestParameters.*;
import static tms.utils.ControllerUtils.getPagePathByType;
import static tms.utils.ServletUtils.getLogin;

@Setter
public class AddCartPageCommandController implements CommandController {

    @Inject
    private ProductService productService;
    @Inject
    private CartService cartService;
    @Inject
    private UserService userService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        PagesPath path;
        Long id = Long.parseLong(request.getParameter(ID));
        String shopFlag = request.getParameter(SHOP);
        String location = request.getParameter(LOCATION);
        String login = getLogin(request);
        cartService.addProductToCart(userService.getUserId(login), id, true, false);
        if (Objects.equals(shopFlag, TRUE)) {
            path = SHOPPING_CART_PAGE;
        } else if (Objects.equals(location, FAVORITE)) {
            path = FAVORITES_PAGE;
        } else if (Objects.equals(location, SEARCH)) {
            path = SEARCH_SAVED_RESULT_PAGE;
        } else if (Objects.equals(location, PRODUCT_PAGE)) {
            path = PRODUCT_JSP_PAGE;
        } else {
            String productType = productService.getProductTypeValue(id);
            path = getPagePathByType(productType);
        }
        return path;
    }
}