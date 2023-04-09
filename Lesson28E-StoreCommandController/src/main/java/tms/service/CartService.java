package tms.service;
import org.apache.commons.lang3.tuple.Pair;
import tms.model.Product;

import java.math.BigDecimal;
import java.util.List;

public interface CartService {

    void addProductToCart(Long userId, Long productId, boolean cart, boolean favorite);

    List<Pair<Product, Integer>> getProductsFromCart(Long userId, boolean cart, boolean favorite);

    void deleteProduct(Long userId, Long productId, boolean cart, boolean favorite);

    void deleteCartProductsAfterBuy(Long userId);

    BigDecimal getProductsPrice(List<Pair<Product, Integer>> productWithCount);

    List<Product> getPurchasedProducts(Long userId, boolean cart, boolean favorite);
}