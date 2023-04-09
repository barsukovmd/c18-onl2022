package main.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ProductType {
    TV("Television"), PHONE("Phone"), FRIDGE("Fridge"), CAR("Car");
    private final String value;

    public ProductType getProductByType(String type) {
        for (ProductType product : values()) {
            if (product.value.equals(type)) {
                return product;
            }
        }
        throw new IllegalArgumentException("Unrecognizable product type " + type);
    }
}
