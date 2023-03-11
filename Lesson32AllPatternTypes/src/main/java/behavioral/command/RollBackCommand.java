package behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RollBackCommand implements Command {
    private Database database;

    @Override
    public void execute() {
        database.rollBack();
    }
}
