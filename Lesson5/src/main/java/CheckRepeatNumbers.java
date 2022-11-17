import java.util.Arrays;

public class CheckRepeatNumbers {
    //   9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
    //        Пример: {0,3,46,3,2,3,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    public static void main(String[] args) {
        int[] array = {1, 22, 3, 4, 2, 5, 7, 5, 3, 22};
        System.out.println(Arrays.toString(array));
        checkRepeatedElements(array);
    }

    private static void checkRepeatedElements(int[] array) {
        if (array != null && array.length > 2) {
            int indexRepeated = 0;
            String[] checkElements = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j] && checkElements != null) {
                        checkElements[indexRepeated] = String.valueOf(array[i]);
                        System.out.println(array[i] + " ");
                        break;
                    }
                }
            }
        }


    }
}
