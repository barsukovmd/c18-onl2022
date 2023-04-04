package tms.controller.impl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.Inject;
import tms.model.PagesPath;
import tms.service.CartService;
import tms.service.UserService;

import static tms.model.PagesPath.SHOPPING_CART_PAGE;
import static tms.utils.Constants.RequestParameters.ID;
import static tms.utils.ServletUtils.getLogin;

@Setter
public class DeleteCartProductPageCommandController implements CommandController {

    @Inject
    private CartService cartService;
    @Inject
    private UserService userService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        String login = getLogin(request);
        Long id = Long.parseLong(request.getParameter(ID));
        cartService.deleteProduct(userService.getUserId(login), id, true, false);
        return SHOPPING_CART_PAGE;
    }
}