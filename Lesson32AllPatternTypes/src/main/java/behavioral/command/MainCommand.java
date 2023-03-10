package behavioral.command;

public class MainCommand {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new InsertCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database),
                new UpdateCommand(database),
                new RollBackCommand(database));
        developer.insertRecord();
        developer.selectRecord();
        developer.rollBack();
        developer.deleteRecord();
        developer.updateRecord();
    }
}
