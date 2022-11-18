public class MassiveOddNumbers {
    //7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
    //        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1)
    public static void main(String[] args) {
        calculateNumbers();
    }

    public static void calculateNumbers() {
        int[] mass = new int[50];
        for (int i = 1, j = 0; i < 100; j++, i += 2) {
            mass[j] = i;
            System.out.print(mass[j] + " ");
        }
        System.out.println();

        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
    }
}