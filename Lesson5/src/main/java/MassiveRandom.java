import java.util.Arrays;
import java.util.Random;

//8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
public class MassiveRandom {
    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            array[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array));
        findMaxNumber(array);
    }

    private static void findMaxNumber(int[] array) {
        if (array != null && array.length > 0) {
            int maxIndex = 0;
            int maxNumber = array[0];

            for (int i = 0; i < array.length; i++) {
                if (array[i] >= maxNumber) {
                    maxNumber = array[i];
                    maxIndex = i;
                }

            }
            System.out.println("Max Index " + maxIndex + " Max number " + maxNumber);
        }
    }
}
