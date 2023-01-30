package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calculator {
    private double a;
    private double b;

//    public void calculation(double a, double b) {
//        for (Actions action : Actions.values()) {
//            switch (action) {
//                case SUM:
//                    System.out.println(a + b);
//                    break;
//                case SUBTRACTION:
//                    System.out.println(a - b);
//                    break;
//                case DIVISION:
//                    System.out.println(a / b);
//                    break;
//                case MULTIPLY:
//                    System.out.println(a * b);
//                    break;
//            }
//        }

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }
}
