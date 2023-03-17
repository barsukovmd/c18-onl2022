package structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Developer developer = new TeamLeadJavaDeveloper(new SeniorJavaDeveloper(new JavaDeveloper()));
        developer.writeCode();
    }
}
