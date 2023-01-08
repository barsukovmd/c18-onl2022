package exercise1.models;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
@Getter
public class Store {
    private Map<Integer, Product> products;

    public Map<Integer, Product> getProducts() {
        if (products == null) {
            products = new HashMap<>();
        }
        return products;
    }
}
