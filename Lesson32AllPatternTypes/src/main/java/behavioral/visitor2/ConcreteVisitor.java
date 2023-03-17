package behavioral.visitor2;

public class ConcreteVisitor implements Visitor {

    @Override
    public void sayDog() {
        System.out.println("Say another gaw");
    }

    @Override
    public void sayCat() {
        System.out.println("Say another meow");
    }
}
