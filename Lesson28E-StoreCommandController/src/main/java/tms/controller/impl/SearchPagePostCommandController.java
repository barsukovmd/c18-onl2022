package tms.controller.impl;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.Setter;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.Inject;
import tms.model.PagesPath;
import tms.model.Product;
import tms.service.ProductService;

import java.util.Set;

import static tms.model.PagesPath.SEARCH_SAVED_RESULT_PAGE;
import static tms.utils.Constants.RequestParameters.SEARCH_CONDITION;
import static tms.utils.ControllerUtils.*;

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