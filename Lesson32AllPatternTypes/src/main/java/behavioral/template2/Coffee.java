package behavioral.template2;

public class Coffee extends Beverage {

    @Override
    void brew() {
        System.out.println("Brewing coffee...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk and sugar...");
    }
}
