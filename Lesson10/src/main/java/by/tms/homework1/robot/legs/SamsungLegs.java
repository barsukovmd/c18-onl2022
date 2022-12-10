package by.tms.homework1.robot.legs;

public class SamsungLegs implements ILeg {
    public SamsungLegs(int price) {
        this.price = price;
    }

    private int price;

    @Override
    public void bend() {
        System.out.println("Samsung legs bends on 90 degrees ");
    }

    @Override
    public void walk() {
        System.out.println("Samsung legs can walk 10.000 miles without fixing");
    }

    @Override
    public void extend() {
        System.out.println("Samsung legs extends fully");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
