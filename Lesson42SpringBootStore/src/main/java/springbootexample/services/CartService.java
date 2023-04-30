package springbootexample.services;

import static springbootexample.model.EshopConstants.SHOPPING_CART;
import static springbootexample.model.PagesPathEnum.CART_PAGE;
import static springbootexample.model.RequestParamsEnum.PRODUCT;

import springbootexample.entities.Cart;
import springbootexample.entities.Product;
import springbootexample.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;


@Service
public class CartService {

    private final ProductRepository productRepository;

    public CartService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ModelAndView addProductToCart(int productId, Cart shopCart) {
        ModelMap modelParams = new ModelMap();

        Product product = productRepository.findById(productId);
        shopCart.addProduct(product);

        modelParams.addAttribute(PRODUCT.getValue(), product);
        modelParams.addAttribute(SHOPPING_CART, shopCart);

        return new ModelAndView(CART_PAGE.getPath(), modelParams);
    }
}
