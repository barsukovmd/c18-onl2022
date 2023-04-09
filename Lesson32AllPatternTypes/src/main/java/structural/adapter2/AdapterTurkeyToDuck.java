package structural.adapter2;

public class AdapterTurkeyToDuck implements Duck {

    Turkey turkey;

    public AdapterTurkeyToDuck(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
