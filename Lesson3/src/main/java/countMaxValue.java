
public class countMaxValue {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int a1 = 10;
        int b1 = 10;
        int x = max(a, b);
        int x1 = max1(a1, b1);

        System.out.println(x);
        System.out.println(x1);

    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max1(int a1, int b1) {
        return Math.max(a1, b1);
    }


}


