package by.tms.homework.robot.heads;

public class SamsungHeads implements IHead {
    private int price;

    public SamsungHeads(int price) {
        this.price = price;
    }

    @Override
    public void turn() {
        System.out.println("Samsung head turns fast");
    }

    @Override
    public void bend() {
        System.out.println("Samsung head bends accurate");
    }

    @Override
    public void rotate() {
        System.out.println("Samsung head rotates on 180 degrees");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
