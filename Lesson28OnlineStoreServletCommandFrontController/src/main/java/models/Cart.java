package models;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cart implements Serializable {
    private List<Products> productsList;

    public void addProduct(Products product) {
        productsList.add(product);
    }

    public void deleteProduct(Products products) {
        productsList.remove(products);
    }
}
