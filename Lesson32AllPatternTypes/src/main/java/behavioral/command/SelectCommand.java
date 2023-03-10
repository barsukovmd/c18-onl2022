package behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SelectCommand implements Command {
    private Database database;

    @Override
    public void execute() {
        database.select();
    }

    @Override
    public void rollBack() {
        if (database != null) {
            database.rollBack();
        } else {
            System.out.println("Nothing to Roll back");
        }
    }
}
