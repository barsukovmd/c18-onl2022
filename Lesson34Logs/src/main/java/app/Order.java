package app;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Order {
    private final static Logger log = LogManager.getLogger(Order.class);

    public void doOrder() {
        log.info("Attempt to add product to shopping cart...");
        addToCart();
        log.info("app.Order has been created");
    }

    private void addToCart() {
        log.warn("Check product list is not empty before adding!...");
        log.info("Item added to shopping cart...");
        log.error("Error occurred after adding to shopping cart...");
    }
}
