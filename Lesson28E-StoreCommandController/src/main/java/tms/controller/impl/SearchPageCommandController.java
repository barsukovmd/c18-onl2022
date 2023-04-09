package tms.controller.impl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.Inject;
import tms.model.PagesPath;
import tms.model.Product;
import tms.service.ProductService;

import java.util.LinkedHashSet;
import java.util.Set;

import static tms.model.PagesPath.SEARCH_JSP_PAGE;
import static tms.utils.Constants.Attributes.FOUND_PRODUCTS;
import static tms.utils.Constants.Attributes.USER_UUID;
import static tms.utils.Constants.RequestParameters.RESULT;
import static tms.utils.Constants.SAVE;

@Setter
public class SearchPageCommandController implements CommandController {

    @Inject
    private ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        Set<Product> productsByUserSearchCondition = new LinkedHashSet<>();
        request.getServletContext().removeAttribute("filter");
        if ("true".equals(request.getParameter("filter"))) {
            request.getServletContext().setAttribute("filter", new Object());
        } else if (request.getSession().getAttribute(USER_UUID) != null) {
            String userUUID = request.getSession().getAttribute(USER_UUID).toString();
            if (!SAVE.equals(request.getParameter(RESULT))) {
                productService.deleteFoundProducts(userUUID);
            }
            productsByUserSearchCondition = productService.getProductsByUserSearchCondition(userUUID);
        }
        request.getServletContext().setAttribute(FOUND_PRODUCTS, productsByUserSearchCondition);
        return SEARCH_JSP_PAGE;
    }
}