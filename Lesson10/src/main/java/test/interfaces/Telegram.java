package test.interfaces;

public class Telegram implements Messenger, Application {
    @Override
    public void getMessage() {
        System.out.println("You have received message");
    }

    @Override
    public void sendMessage() {
        System.out.println("You have sent message");
    }
}
