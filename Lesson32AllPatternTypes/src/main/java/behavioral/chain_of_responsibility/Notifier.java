package behavioral.chain_of_responsibility;

import lombok.Setter;

@Setter
public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public abstract void write(String message);

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(message, level);
        }
    }
}
