package homework.robot.hands;

public class SonyHands implements IHand {
    private int price;

    public SonyHands(int price) {
        this.price = price;
    }

    @Override
    public void grab() {
        System.out.println("Sony hands grabbing subjects too slow but accurate");
    }

    @Override
    public void release() {
        System.out.println("Sony hands can release hands not enough fast");
    }

    @Override
    public void upAndDown() {
        System.out.println("Sony hands are fast to up and down");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
