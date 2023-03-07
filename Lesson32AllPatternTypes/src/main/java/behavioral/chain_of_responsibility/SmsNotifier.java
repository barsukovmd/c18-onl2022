package behavioral.chain_of_responsibility;

public class SmsNotifier extends Notifier {
    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sms notifier " + message);
    }
}
