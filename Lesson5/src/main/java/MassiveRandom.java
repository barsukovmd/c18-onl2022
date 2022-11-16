import java.util.Random;

//8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
public class MassiveRandom {
    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();
        int c = random.nextInt(15);
        getMaxElementPosition(array);
    }


    public static void getMaxElementPosition(int[] array) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max > array[i]) {
                max = i;
            }
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    index = array[j];
                    System.out.println(index);
                }
            }
        }
        array[max] = max;
        array[index] = index;
    }
}
