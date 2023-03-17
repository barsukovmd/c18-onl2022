package structural.bridge;

public class MainBridge {

    public static void main(String[] args) {
        Program[] programs = {new BankApplication(new JavaDeveloper()), new StoreApplication(new PhpDeveloper())};
        for (Program program : programs) {
            program.developProgram();
        }
    }
}
