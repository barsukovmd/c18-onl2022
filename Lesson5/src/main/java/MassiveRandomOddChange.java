import java.util.Arrays;
import java.util.Random;

public class MassiveRandomOddChange {
    //9) Создайте массив размера 20, заполните его случайными целыми числами из отрезка от 0 до 20.
    //        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
    public static void main(String[] args) {
        int[] nums = new int[20];
        Random random = new Random();
        checkOddNumberMassive(nums, random);
    }

    public static void checkOddNumberMassive(int[] nums, Random random) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(20);
            if (nums[i] % 2 != 0) {
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
