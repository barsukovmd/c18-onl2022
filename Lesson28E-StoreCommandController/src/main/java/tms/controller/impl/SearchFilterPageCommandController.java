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

import java.math.BigDecimal;
import java.util.Set;

import static tms.model.PagesPath.SEARCH_FILTER_RESULT_PAGE;
import static tms.utils.Constants.Attributes.FILTER_FOUND_PRODUCTS;
import static tms.utils.ControllerUtils.checkAndGetUserUUID;
import static tms.utils.ControllerUtils.getPrice;


@Setter
public class SearchFilterPageCommandController implements CommandController {

    @Inject
    private ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        BigDecimal minPrice = getPrice(request, "min-price", BigDecimal.ZERO);
//        BigDecimal minPrice;
        BigDecimal maxPrice = getPrice(request, "max-price", new BigDecimal(Long.MAX_VALUE));
//        BigDecimal maxPrice;
        Set<Product> products;
//        if (!StringUtils.isAllBlank(request.getParameter("min-price"))) {
//            minPrice = new BigDecimal(request.getParameter("min-price"));
//        } else {
//            minPrice = BigDecimal.ZERO;
//        }
//        if (!StringUtils.isAllBlank(request.getParameter("max-price"))) {
//            maxPrice = new BigDecimal(request.getParameter("max-price"));
//        } else {
//            maxPrice = new BigDecimal(Long.MAX_VALUE);
//        }
        String type = request.getParameter("select");
        HttpSession session = request.getSession(false);
        String userUUID = checkAndGetUserUUID(request, session);
        if (productService.getProductsByUserSearchCondition(userUUID).size() > 0) {
            products = productService.selectFoundedProductsByFilter(type, minPrice, maxPrice, userUUID);
        } else {
            products = productService.selectAllProductsByFilter(type, minPrice, maxPrice);
            productService.deleteFoundProducts(userUUID);
            productService.saveFoundedProducts(products, userUUID);
        }
        request.getServletContext().setAttribute(FILTER_FOUND_PRODUCTS, products);
        return SEARCH_FILTER_RESULT_PAGE;
    }
}