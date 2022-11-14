public class AmebaDivision {
    public static void main(String[] args) {
        for (int a = 1; a <= 24; a += 3) {
            int x = a * 2;
            if (a == 24) {
                break;
            }
            System.out.println(x);
        }
    }
}
//2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа