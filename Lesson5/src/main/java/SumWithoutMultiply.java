public class SumWithoutMultiply {
    public static void main(String[] args) {
        int a = -10, b = -10;
        int x = sum(a, b);
        System.out.println(x);
        System.out.println(sum(-3, 5));
        System.out.println(sum(3, -5));
        System.out.println(sum(3, 5));
        System.out.println(sum(-3, -5));
        System.out.println(sum(0, -5));
        System.out.println(sum(-5, 0));
        System.out.println(sum(1, 10000));
    }

    public static int sum(int a, int b) {
        int minValue = Math.min(Math.abs(a), Math.abs(b));
        int maxValue = Math.max(Math.abs(a), Math.abs(b));
        int c = 0;
        for (int i = 0; i < minValue; i++) {
            c += maxValue;
        }
        if (a < 0 ^ b < 0) {
            return -c;
        }
        return c;
    }
}
