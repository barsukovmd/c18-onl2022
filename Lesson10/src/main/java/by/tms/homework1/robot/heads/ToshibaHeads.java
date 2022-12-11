package by.tms.homework1.robot.heads;

public class ToshibaHeads implements IHead {
    private int price;

    public ToshibaHeads(int price) {
        this.price = price;
    }

    @Override
    public void turn() {
        System.out.println("Toshiba head turns precise and fast");
    }

    @Override
    public void bend() {
        System.out.println("Toshiba head bends slow and needs to be fixed");
    }

    @Override
    public void rotate() {
        System.out.println("Toshiba head rotates on 110 degrees");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

