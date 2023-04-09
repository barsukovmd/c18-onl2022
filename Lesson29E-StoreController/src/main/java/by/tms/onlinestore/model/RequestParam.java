package by.tms.onlinestore.model;

public enum RequestParam {
    LOGIN("login"),
    PASSWORD("password"),
    PRODUCT_ID("productId"),
    SURNAME("surname"),
    DATE_OF_BIRTH("dateOfBirth"),
    SEX("sex"),
    EMAIL("email"),
    DATE_OF_REGISTRY("dateOfRegistry"),
    ID("id"),
    IMAGE_NAME("imageName"),
    NAME("name"),
    DESCRIPTION("description"),
    PRICE_PARAMETER("price"),
    CATEGORY_ID("categoryId"),
    NAME_CATEGORY("nameCategory"),
    ACTION("action"),
    COMMAND("command");

    private final String value;

    RequestParam(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
