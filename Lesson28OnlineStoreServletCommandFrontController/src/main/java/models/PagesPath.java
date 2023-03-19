package models;

import lombok.Getter;

@Getter
public enum PagesPath {
    CART("cart.jsp"),
    CATEGORY("category,jsp"),
    HEADER("header.jsp"),
    HOME_PAGE("home.jsp"),
    PRODUCTS("products.jsp"),
    PROFILE("profile.jsp"),
    SIGNING_PAGE("sign-in.jsp");
    private final String path;

    PagesPath(String path) {
        this.path = path;
    }
}
