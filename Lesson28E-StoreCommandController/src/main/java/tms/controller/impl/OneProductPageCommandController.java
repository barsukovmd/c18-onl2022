package tms.controller.impl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Setter;
import tms.controller.CommandController;
import tms.exception.CommandException;
import tms.model.Inject;
import tms.model.PagesPath;
import tms.model.Product;
import tms.service.ProductService;

import static tms.model.PagesPath.PRODUCT_JSP_PAGE;

@Setter
public class OneProductPageCommandController implements CommandController {

    @Inject
    private ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws CommandException {
        if (request.getParameter("id") != null) {
            Long id = Long.parseLong(request.getParameter("id"));
            Product product = productService.getOneProduct(id);
            request.getServletContext().setAttribute("oneProduct", product);
        }
        return PRODUCT_JSP_PAGE;
    }
}