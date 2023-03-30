package app;

public class Application {
    private static Order order;

    public static void main(String[] args) {
        order = new Order();
        order.doOrder();
    }
}
