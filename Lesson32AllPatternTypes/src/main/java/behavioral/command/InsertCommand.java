package behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InsertCommand implements Command {
    private Database database;

    @Override
    public void execute() {
        database.insert();
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
