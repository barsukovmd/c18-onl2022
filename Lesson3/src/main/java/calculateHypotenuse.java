public class calculateHypotenuse {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int a1 = 12;
        int b1 = 16;
        int x = calculate(a, b);
        int x1 = calculate1(a1, b1);

        System.out.println("Hypotenuse for the first example is " + x);
        System.out.println("Hypotenuse for the second example is " + x1);

    }

    private static int calculate1(int a1, int b1) {
        return (int) Math.sqrt(a1 * a1 + b1 * b1);
    }

    public static int calculate(int a, int b) {
        return (int) Math.sqrt(a * a + b * b);
    }

}
