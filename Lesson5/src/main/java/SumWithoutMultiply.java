public class SumWithoutMultiply {
    public static void main(String[] args) {
        int a = 7, b = 6;
        int x = sum(a, b);
        System.out.println(x);
    }

    public static int sum(int a, int b) {
        int c = a;
        for (int i = 0; i < b; i++) {
            c += a;
            if (c == a * b) {
                break;
            }
        }
        return c;
    }
}
