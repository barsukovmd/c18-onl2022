package behavioral.chain_of_responsibility;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending notify by email: " + message);
    }
}
