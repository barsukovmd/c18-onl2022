package by.tms.test2.interfaces;

public class Main {
    public static void main(String[] args) {
        Calculable c = new Calculation();
        System.out.println(c.sum(3, 4, 5));
        System.out.println(c.sum(3, 6));
    }
}
