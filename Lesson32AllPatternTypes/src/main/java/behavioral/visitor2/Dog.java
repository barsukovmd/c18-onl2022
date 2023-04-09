package behavioral.visitor2;

public class Dog implements Animal {

    @Override
    public void say(Visitor visitor) {
        visitor.sayDog();
    }
}
