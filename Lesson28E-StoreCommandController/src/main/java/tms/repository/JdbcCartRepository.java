package tms.repository;

import by.tms.model.Product;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public interface JdbcCartRepository extends BaseRepository {

    void addProduct(Long userId, Long productId, boolean cart, boolean favorite);

    void deleteProduct(Long userId, Long productId, boolean cart, boolean favorite);

    List<Pair<Product, Integer>> getProductsFromCart(Long userId, boolean cart, boolean favorite);

    boolean checkProduct(Long userId, Long productId, boolean cart, boolean favorite);

    Integer getCartProductCount(Long userId, Long productId);

    void deleteCartProductsAfterBuy(Long userId);

    List<Product> getPurchasedProducts(Long userId, boolean cart, boolean favorite);
}