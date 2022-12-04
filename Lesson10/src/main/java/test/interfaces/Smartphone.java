package test.interfaces;

public class Smartphone implements Application {
    private Application application;

    public Smartphone() {
        this.application = new Telegram();
    }

    public void checkSmartphone() {
        application.print();
        System.out.println("checkSmartphone");
    }
}
