public class PrimeMembers {
    public static void main(String[] args) {
        int x = 0;
        printPrimeMembers(x);
    }

    private static void printPrimeMembers(int x) {
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            boolean isPrimeMembers = true;
            for (x = 2; x < i; x++) {
                if (i % x == 0) {
                    isPrimeMembers = false;
                    break;
                }
            }
            if (isPrimeMembers) {
                count++;
                System.out.println(i + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
