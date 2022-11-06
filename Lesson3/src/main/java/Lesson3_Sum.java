public class Lesson3_Sum {

    public static void main(String[] args) {
        int calculateSum = sum(100, 200);
        System.out.println(calculateSum);
    }

    public static int sum(int a, int b) {
        if ((a + b) > Integer.max(100, 200)) {
            return -1;
        } else {
            return a + b;
        }

    }

}





