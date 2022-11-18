public class AmebaDivision {
    public static void main(String[] args) {
        for (int i = 0; i <= 24; i += 3) {
            System.out.println(calculateAmebaDivision(1, i) + " ");
        }
        System.out.println();
    }

    private static int calculateAmebaDivision(int begin, int time) {
        return (int) (begin * Math.pow(2, time / 3));
    }
}