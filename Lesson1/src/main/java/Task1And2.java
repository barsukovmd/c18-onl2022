public class Task1And2 {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            int i = Integer.parseInt(arg);
            if (i > 0) {
                count++;
            }
        }
        System.out.println("Колличество положительных чисел "+ count);
    }
}