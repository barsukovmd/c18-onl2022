package by.tms.homework.robot.legs;

public class ToshibaLegs implements ILeg {
    private int price;

    public ToshibaLegs(int price) {
        this.price = price;
    }

    @Override
    public void bend() {
        System.out.println("Toshiba legs bends on 80 degrees ");
    }

    @Override
    public void walk() {
        System.out.println("Toshiba legs can walk 20.000 miles with no repair");
    }

    @Override
    public void extend() {
        System.out.println("Toshiba legs can fully extend");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
