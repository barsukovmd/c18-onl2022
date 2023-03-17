package behavioral.visitor2;

public class MainVisitor2 {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.say(new ConcreteVisitor());
        cat.say(new ConcreteVisitor());
    }
}
