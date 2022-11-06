public class Test_integers {
    public static void main(String[] args) {
        double a = 56.56789;
        int b = (int) Math.round(a);
        System.out.println(b);
        System.out.println();
        byte A = 3;
        short B = 14;
        byte C = (byte) (A + B);
        System.out.println(C);
        int a1 = 19;
        int b1 = 3;
        int c1 = a1 % b1;
        System.out.println(c1);
        System.out.println();
        double a5 = 14 % 5;
        System.out.println(a5);

        int aa = 5;
        int bb = --aa;
        int Aa = aa;
        System.out.println(Aa);
        System.out.println(bb);
        System.out.println();

        int bbb = 12;
        int kk = 1 + ++bbb;//14
        System.out.println(bbb);//13

        byte aA = 3;
        short bB = 4;
        byte c = (byte) (aA + bB);
        System.out.println(c);
    }
}
