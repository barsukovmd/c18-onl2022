package tms.controller.impl;

import by.tms.controller.CommandController;
import by.tms.exception.CommandException;
import by.tms.model.Inject;
import by.tms.model.PagesPath;
import by.tms.model.Product;
import by.tms.service.ProductService;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;

import static by.tms.model.PagesPath.PRODUCT_JSP_PAGE;

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