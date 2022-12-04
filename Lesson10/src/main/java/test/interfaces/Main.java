package test.interfaces;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.getMessage();
        client.sendMessage();
        Smartphone smartphone = new Smartphone();
        smartphone.checkSmartphone();
        Application.checkStatic();
    }
}
