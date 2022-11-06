public class calculate_Hypotenuse {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int x = calculate(a, b);
        System.out.println(x);
    }

    public static int calculate(int a, int b) {
        return (int) Math.sqrt(a * a + b * b);
    }

}
