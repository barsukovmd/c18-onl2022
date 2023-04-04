package tms.controller.impl;

import by.tms.controller.CommandController;
import by.tms.exception.CommandException;
import by.tms.model.Inject;
import by.tms.model.PagesPath;
import by.tms.service.CartService;
import by.tms.service.UserService;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;

import static by.tms.model.PagesPath.FAVORITES_PAGE;
import static by.tms.utils.Constants.RequestParameters.ID;
import static by.tms.utils.ServletUtils.getLogin;

@Setter
public class DeleteFavoriteCommandController implements CommandController {

    @Inject
    private CartService cartService;
    @Inject
    private UserService userService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        String login = getLogin(request);
//        try {
        Long id = Long.parseLong(request.getParameter(ID));
        cartService.deleteProduct(userService.getUserId(login), id, false, true);
//        } catch (Exception e) {
//            throwCommandException(request, e, this.getClass());
//        }
        return FAVORITES_PAGE;
    }
}