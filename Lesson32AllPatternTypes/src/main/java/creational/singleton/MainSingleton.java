package creational.singleton;

public class MainSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setInstance();
    }

}

