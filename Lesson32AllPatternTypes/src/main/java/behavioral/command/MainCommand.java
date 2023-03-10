package behavioral.command;

public class MainCommand {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new SelectCommand(database),
                new InsertCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database));
        developer.selectRecord();
        developer.insertRecord();
        developer.updateRecord();
        developer.deleteRecord();
        Command command = new DeleteCommand(database);
        command.rollBack();
    }
}
