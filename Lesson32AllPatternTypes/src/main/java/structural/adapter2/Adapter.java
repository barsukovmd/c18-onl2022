package structural.adapter2;

public class Adapter {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();
        Duck turkey = new AdapterTurkeyToDuck(new WildTurkey());
        turkey.fly();
        turkey.quack();
    }
}
