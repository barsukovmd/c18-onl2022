package tms.controller.impl;

import by.tms.controller.CommandController;
import by.tms.exception.CommandException;
import by.tms.model.Inject;
import by.tms.model.PagesPath;
import by.tms.service.CartService;
import by.tms.service.ProductService;
import by.tms.service.UserService;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

import static by.tms.model.PagesPath.*;
import static by.tms.utils.Constants.RequestParameters.*;
import static by.tms.utils.ControllerUtils.getPagePathByType;
import static by.tms.utils.ServletUtils.getLogin;

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
//        PagesPath path = getHomePagePath();
//        try {
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
//        } catch (Exception e) {
//            throwCommandException(request, e, this.getClass());
//        }
        return path;
    }
}