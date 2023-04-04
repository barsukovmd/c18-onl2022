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

import static tms.model.PagesPath.PRODUCT_JSP_PAGE;
import static tms.model.PagesPath.SEARCH_SAVED_RESULT_PAGE;
import static tms.utils.Constants.RequestParameters.*;
import static tms.utils.ControllerUtils.getPagePathByType;
import static tms.utils.ServletUtils.getLogin;

@Setter
public class AddFavoritePageCommandController implements CommandController {

    @Inject
    private ProductService productService;
    @Inject
    private CartService cartService;
    @Inject
    private UserService userService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        String login = getLogin(request);
        PagesPath path;
//        PagesPath path = getHomePagePath();
        String location = request.getParameter(LOCATION);
//        try {
        Long id = Long.parseLong(request.getParameter(ID));
        cartService.addProductToCart(userService.getUserId(login), id, false, true);
        String productType = productService.getProductTypeValue(id);
        if (Objects.equals(location, SEARCH)) {
            path = SEARCH_SAVED_RESULT_PAGE;
        } else if (Objects.equals(location, PRODUCT_PAGE)) {
            path = PRODUCT_JSP_PAGE;
        } else {
            path = getPagePathByType(productType);
        }
//        } catch (Exception e) {
//            throwCommandException(request, e, this.getClass());
//        }
        return path;
    }
}