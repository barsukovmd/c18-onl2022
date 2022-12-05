package homework.robot.heads;

public class SonyHeads implements IHead {
    private int price;

    public SonyHeads(int price) {
        this.price = price;
    }

    @Override
    public void turn() {
        System.out.println("Sony head turns slow");
    }

    @Override
    public void bend() {
        System.out.println("Sony head bends very fast and precise");
    }

    @Override
    public void rotate() {
        System.out.println("Sony head rotate on 90 degrees");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
