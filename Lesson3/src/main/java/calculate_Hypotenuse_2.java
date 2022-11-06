public class calculate_Hypotenuse_2 {
    public static void main(String[] args) {
        int a = 12;
        int b = 16;
        int x = calculate(a, b);
        System.out.println(x);
    }

    public static int calculate(int a, int b) {
        return (int) Math.sqrt(a * a + b * b);
    }

}
