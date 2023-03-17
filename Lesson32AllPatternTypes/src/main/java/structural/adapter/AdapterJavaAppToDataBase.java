package structural.adapter;

public class AdapterJavaAppToDataBase extends JavaApplication implements DataBase {

    @Override
    public void create() {
        createObject();
    }

    @Override
    public void read() {
        readObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
