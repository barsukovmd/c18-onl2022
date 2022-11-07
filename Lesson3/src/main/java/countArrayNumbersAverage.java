
public class countArrayNumbersAverage {
    public static void main(String[] args) {
        int[] arrays = {0, -2, 3, -1, 5};
        double x = average(arrays);
        System.out.println(x);
    }

    public static double average(int[] arrays) {
        int sum = 0;
        for (int array : arrays) {
            sum += array;
        }
        return (double) sum / arrays.length;
    }
}
