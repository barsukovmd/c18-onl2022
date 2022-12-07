package by.tms.homework.robot.legs;

public class SonyLegs implements ILeg {
    private int price;

    public SonyLegs(int price) {
        this.price = price;
    }

    @Override
    public void bend() {
        System.out.println("Sony legs can be bended approximately on 110 degrees ");
    }

    @Override
    public void walk() {
        System.out.println("Sony legs can walk 15.000 miles without fixing");
    }

    @Override
    public void extend() {
        System.out.println("Sony legs can extend on 170 degrees");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
