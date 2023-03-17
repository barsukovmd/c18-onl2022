package structural.bridge;

public class BankApplication extends Program {

    public BankApplication(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank application is developing...");
        developer.writeCode();
    }
}
