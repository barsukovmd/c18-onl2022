package tms.controller.impl;

import by.tms.controller.CommandController;
import by.tms.exception.CommandException;
import by.tms.model.Inject;
import by.tms.model.PagesPath;
import by.tms.model.Product;
import by.tms.service.ProductService;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Set;

import static by.tms.model.PagesPath.SEARCH_SAVED_RESULT_PAGE;
import static by.tms.utils.Constants.RequestParameters.SEARCH_CONDITION;
import static by.tms.utils.ControllerUtils.checkAndGetUserUUID;

@Setter
public class SearchPagePostCommandController implements CommandController {

    @Inject
    private ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        String searchCondition = request.getParameter(SEARCH_CONDITION);
        if (!searchCondition.isEmpty()) {
            Set<Product> products = productService.getFoundProducts(searchCondition);
            HttpSession session = request.getSession(false);
            String userUUID = checkAndGetUserUUID(request, session);
            productService.deleteFoundProducts(userUUID);
            productService.saveFoundedProducts(products, userUUID);
        }
        return SEARCH_SAVED_RESULT_PAGE;
    }
}