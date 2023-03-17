package structural.adapter;

public class MainAdapter {

    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaAppToDataBase();
        dataBase.create();
        dataBase.read();
        dataBase.update();
        dataBase.delete();
    }
}
