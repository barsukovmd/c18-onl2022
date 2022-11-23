import java.util.Random;

public class MatrixSquare {
    //12) Создаём квадратную матрицу, размер вводим с клавиатуры.
    //        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7
    public static void main(String[] args) {
        transpositionMatrix();
    }

    public static void transpositionMatrix() {
        int[][] ints = new int[4][4];
        int[][] transposition = new int[ints.length][ints.length];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                ints[i][j] = random.nextInt(50);
                transposition[j][i] = ints[i][j];
                System.out.print("\t" + transposition[j][i]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print("\t" + transposition[i][j]);
            }
            System.out.println();
        }
    }
}
