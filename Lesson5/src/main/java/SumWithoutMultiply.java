public class SumWithoutMultiply {
    public static void main(String[] args) {
        int a = 10, b = 10;
        int x = sum(a, b);
        System.out.println(x);
    }

    public static int sum(int a, int b) {
        int c = 0;
        for (int i = 0; i < b; i++) {
            c += a;
            if (a == 0 || b == 0) {
                return 0;
            } else if (a < 0 && b < 0) {
                return Math.abs(c);
            }
        }
        return 0;//нужна помощь
    }
}
