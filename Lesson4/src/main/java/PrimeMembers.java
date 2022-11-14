public class PrimeMembers {
    public static void main(String[] args) {
        System.out.println("You have entered Prime number");
        int x = 0;
        printPrimeMembers(x);
    }

    public static void printPrimeMembers(int x) {
        for (x = 0; x < 1000; x++) {
            if (x > 1 & x % 2 != 0 & x % 3 != 0 & x % 5 != 0 || x == 2 || x == 3 || x == 5) {
                System.out.println(x);
            }
        }
    }
}




/*
 * Задача со звездочкой!
 * Метод должен печатать все простые числа <1000
 * Что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
 */