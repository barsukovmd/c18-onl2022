import java.util.Arrays;

public class MaxValueTransition {
    //10) Найти максимальный элемент в массиве
    // {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void main(String[] args) {
        int[] mass = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        maxValueTransition(mass);
    }

    public static void maxValueTransition(int[] mass) {
        int max = mass[0];
        int maxPlace = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
                maxPlace = i;
            }
        }
        mass[maxPlace] = mass[0];
        mass[0] = max;
        System.out.println(Arrays.toString(mass));
    }
}
