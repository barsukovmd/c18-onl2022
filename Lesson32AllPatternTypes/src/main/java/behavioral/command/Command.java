package behavioral.command;

public interface Command {
    void execute();

    default void rollBack() {
        System.out.println("Rolling back previous execution");
    }
}
