package behavioral.command;

public class Developer {
    private final Command insert;
    private final Command select;
    private final Command delete;
    private final Command update;

    public Developer(Command insert, Command select, Command delete, Command update) {
        this.insert = insert;
        this.select = select;
        this.delete = delete;
        this.update = update;
    }

    public void insertRecord() {
        insert.execute();
    }

    public void selectRecord() {
        select.execute();
    }

    public void updateRecord() {
        update.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }
}
