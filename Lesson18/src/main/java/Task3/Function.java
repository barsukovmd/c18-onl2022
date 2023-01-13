package Task3;

import java.util.Scanner;

public class Function {
    private final static Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void showResult() {
        switch (scanner.nextInt()) {
            case 1 -> {
                Functional<String> stringFunctional = this::reverseWords;
                System.out.println("Please enter word or sentence");
                System.out.println(stringFunctional.getFunction(scanner.next()));
            }
            case 2 -> {
                Functional<Integer> integerFunctional = this::getFactorial;
                System.out.println("Please enter number to get factorial");
                System.out.println(integerFunctional.getFunction(scanner.nextInt()));
            }
            default -> throw new IllegalArgumentException("You have entered wrong number ");
        }
    }

    public String reverseWords(String reverse) {
        return new StringBuilder(reverse).reverse().toString();
    }

    public Integer getFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; ++i)
            factorial *= i;
        return Math.toIntExact(factorial);
    }
}
