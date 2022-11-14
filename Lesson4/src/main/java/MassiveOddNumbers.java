public class MassiveOddNumbers {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 1; i < a.length; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] b = new int[100];
        for (int i = 99; i < b.length; i -= 2) {
            System.out.print(i + " ");
            if (i <= 1) {
                break;
            }
        }
    }
}


//7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).