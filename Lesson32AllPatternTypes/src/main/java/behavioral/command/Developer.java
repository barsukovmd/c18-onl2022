package behavioral.command;

import lombok.NonNull;

@NonNull
public class Developer {
    private final Command insert;
    private final Command select;
    private final Command delete;
    private final Command update;
    private final Command rollBack;

    public Developer(Command insert, Command select, Command delete, Command update, Command rollBack) {
        this.insert = insert;
        this.select = select;
        this.delete = delete;
        this.update = update;
        this.rollBack = rollBack;
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

    public void rollBack() {
        rollBack.execute();
    }
}
