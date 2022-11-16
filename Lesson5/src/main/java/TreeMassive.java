
import java.lang.reflect.Array;

public class TreeMassive {
    public static void main(String[] args) {

        int[][] arrays = new int[4][4];
        for (int i = 0; i <= arrays.length; i++) {              //a)
            for (int j = 0; j < arrays.length - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();


        }
        for (int i = 0; i <= arrays.length; i++) {           //b)
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i <= arrays.length; i++) {              //d)
            for (int j = 0; j < arrays.length - i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


//   6) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
//
////        a)                  b)
////              *        *
////            * *        * *
////          * * *        * * *
////        * * * *        * * * *
////
////        c)                  d)
////        * * * *        * * * *
////          * * *        * * *
////            * *        * *
////              *        *

