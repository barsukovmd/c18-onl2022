package by.tms.homework1.robot.hands;

public class SamsungHands implements IHand {
    private int price;

    public SamsungHands(int price) {
        this.price = price;
    }

    @Override
    public void grab() {
        System.out.println("Samsung hand can grab wide subjects");
    }

    @Override
    public void release() {
        System.out.println("Samsung hand can release subjects faster than anyone");

    }

    @Override
    public void upAndDown() {
        System.out.println("Samsung hand can slowly up and down its hand ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
