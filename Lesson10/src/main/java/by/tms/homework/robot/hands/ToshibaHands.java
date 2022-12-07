package by.tms.homework.robot.hands;

public class ToshibaHands implements IHand {
    private int price;

    public ToshibaHands(int price) {
        this.price = price;
    }

    @Override
    public void grab() {
        System.out.println("Toshiba hands are powerful");
    }

    @Override
    public void release() {
        System.out.println("Toshiba hands are too heavy to release fast ");
    }

    @Override
    public void upAndDown() {
        System.out.println("Toshiba hands make precise movements");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
