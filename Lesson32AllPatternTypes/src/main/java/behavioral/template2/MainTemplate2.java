package behavioral.template2;

public class MainTemplate2 {
    public static void main(String[] args) throws InterruptedException {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        Thread.sleep(1000);
        tea.makeBeverage();
        Thread.sleep(1000);
        coffee.makeBeverage();
    }
}
