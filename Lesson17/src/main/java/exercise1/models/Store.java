package exercise1.models;


import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
public class Store {
    private Map<Integer, Product> products;

    public Map<Integer, Product> getProducts() {
        if (products == null) {
            products = new HashMap<>();
        }
        return products;
    }
}
