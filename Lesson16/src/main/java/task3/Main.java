package task3;

// * 3)Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
// * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
// * Написать метод принимающий MinMax объект и печатающий информацию об элементах.
// *
public class Main {
    public static void main(String[] args) {
        Double[] dbl = {132.134, 2.4, 324.5, 134.2};
        Integer[] integer = {13241, 124, 14, 1414, 14123};
        MinMax<?> minMaxDbl = new MinMax<>(dbl);
        MinMax<?> minMaxInteger = new MinMax<>(integer);
        MinMax<Integer> minMaxInteger2 = createMinMax(integer);
        printMinAndMaxValue(minMaxInteger2);
        getInfo(minMaxInteger2);

        printMinAndMaxValue(minMaxDbl);
        getInfo(minMaxDbl);
        printMinAndMaxValue(minMaxInteger);
        getInfo(minMaxInteger);
    }

    public static <T extends Number> MinMax<T> createMinMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("incorrect input parameters");
        }
        return new MinMax<>(array);
    }

    private static void printMinAndMaxValue(MinMax<?> minMax) {
        System.out.println("Минимальный элемент " + minMax.getMin() + "\n" + "Максимальный элемент " + minMax.getMax());
    }

    private static void getInfo(MinMax<?> minMax) {
        for (int i = 0; i < minMax.getArrayOfNumbers().length; i++) {
            System.out.println("Элемент " + minMax.getArrayOfNumbers()[i] + " типа " + minMax.getArrayOfNumbers()[i].getClass().getName());
        }
        System.out.println();
    }

}
