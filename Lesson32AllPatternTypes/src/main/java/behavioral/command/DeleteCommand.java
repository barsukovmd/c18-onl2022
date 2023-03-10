package behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteCommand implements Command {
    private Database database;

    @Override
    public void execute() {
        database.delete();
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
