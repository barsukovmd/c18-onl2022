package behavioral.visitor2;

public class Cat implements Animal {

    @Override
    public void say(Visitor visitor) {
        visitor.sayCat();
    }
}
