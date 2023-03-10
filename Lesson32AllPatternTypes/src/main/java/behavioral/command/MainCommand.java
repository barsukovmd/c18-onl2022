package behavioral.command;

public class MainCommand {
    public static void main(String[] args) {
        Database database = new Database();
        Command command = new DeleteCommand(database);
        command.rollBack();
        Developer developer = new Developer(
                new InsertCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database),
                new UpdateCommand(database));
        developer.insertRecord();
        developer.selectRecord();
        developer.deleteRecord();
        developer.updateRecord();
    }
}
