
public class CalculateOddEvenNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int y = calculateCountOfOddElementsInMatrix(nums);
        System.out.println(y);// не могу понять почему возвращает последнее число 2 раза
    }

    public static int calculateCountOfOddElementsInMatrix(int[] nums) {
        int odd = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                odd = num;
                System.out.println(odd);
            }
        }
        return odd;
    }
}

/*
 * На вход приходит массив целых чисел типа int
 * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
 * в котором это значение распечатается на консоль.
 */
