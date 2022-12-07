package by.tms.test.interfaces;

public class Client extends Telegram {
    private Messenger messenger;

    public Client() {
        this.messenger = new Telegram();

    }
}
