public class countSum {
    public static void main(String[] args) {
        long calculateSum = sum(100, 200);
        System.out.println(calculateSum);
    }

    public static int sum(int a, int b) {
        if ((a + b) > Integer.MAX_VALUE) { //нужно ли написать Integer.max(a,b) ?? 
            return -1;
        } else {
            return a + b;
        }

    }

}





