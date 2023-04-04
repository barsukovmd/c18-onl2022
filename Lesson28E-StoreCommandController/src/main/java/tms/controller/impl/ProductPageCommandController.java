package tms.controller.impl;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.Inject;
import tms.model.PagesPath;
import tms.model.Product;
import tms.service.ProductService;

import java.util.List;

import static tms.model.PagesPath.PRODUCTS_PAGE;
import static tms.utils.Constants.Attributes.PRODUCTS;
import static tms.utils.Constants.RequestParameters.TYPE;

@Setter
public class ProductPageCommandController implements CommandController {

    @Inject
    private ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        List<Product> products = productService.getProductsByType(request.getParameter(TYPE));
        request.getServletContext().setAttribute(PRODUCTS, products);
        return PRODUCTS_PAGE;
    }
}