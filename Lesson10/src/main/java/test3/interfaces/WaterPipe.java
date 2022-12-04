package test3.interfaces;

public class WaterPipe implements Stable {
    @Override
    public void checkPipe(int n) {
        if (n == OPEN) {
            System.out.println("Opened");
        } else if (n == CLOSED) {
            System.out.println("Closed");
        } else {
            System.out.println("Invalid");
        }
    }
}
