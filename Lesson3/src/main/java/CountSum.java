import static java.lang.Integer.MAX_VALUE;

public class CountSum {
    public static void main(String[] args) {
        long calculateSum = sum(100, 200);
        System.out.println(calculateSum);
    }

    public static int sum(int a, int b) {
        if (((long) a + b) > MAX_VALUE) {
            return -1;
        } else {
            return a + b;
        }
    }
}





