public class Task1_2 {
    public static void main(String[] args) {
        int count = 0;
        String[] strings = new String[5];
        strings[0] = "23";
        strings[1] = "89";
        strings[2] = "1";
        strings[3] = "-1";
        strings[4] = "3";
        for (String arg : strings) {
            int i = Integer.parseInt(arg);
            if (i > 0) {
                count++;
            }
        }
        System.out.println("Колличество положительных чисел "+ count);
    }
}