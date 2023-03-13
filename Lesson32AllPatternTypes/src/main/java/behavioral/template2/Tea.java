package behavioral.template2;

public class Tea extends Beverage {

    @Override
    void brew() {
        System.out.println("Brewing  tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon and sugar...");
    }
}
