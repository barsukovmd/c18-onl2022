public class CalculateHypotenuse {
    public static void main(String[] args) {
        int a = 3;//12
        int b = 4;//16
        int x = calculate(a, b);
        System.out.println("Hypotenuse is " + x);
    }

    public static int calculate(int a, int b) {
        return (int) Math.hypot(a, b);
    }
}
