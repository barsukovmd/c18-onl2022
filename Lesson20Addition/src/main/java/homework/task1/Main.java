package homework.task1;
///**
// * Напишите программу, моделирующую кассы в магазине.
// * Существует несколько касс, работающих одновременно.
// * Каждый покупатель — отдельный поток.
// * Общее количество покупателей может быть больше, чем количество касс,
// * но одновременно не может обрабатываться больше покупателей, чем имеется рабочих касс.
// * У каждого покупателя есть набор товаров, которые должны быть выведены на консоль в процессе обслуживания.
// */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    //Если честно не понял как сделать ВСЕ через Stream API
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        try {
            List<Cashier> cashiers = IntStream.range(0, 5)
                    .boxed()
                    .map(x -> new Cashier("Cashier #" + x))
                    .toList();
//            List<Cashier> cashDeskList = Arrays.asList(
//                    new Cashier("Cashier #1"),
//                    new Cashier("Cashier #2"),
//                    new Cashier("Cashier #3"),
//                    new Cashier("Cashier #4"),
//                    new Cashier("Cashier #5"));

            for (int i = 1; i <= 20; i++) {
                new Buyer("\t" + "Number " + i,
                        cashiers.stream().toList(),
                        Arrays.stream(ProductType.values()).toList()).start();
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage() + " error has occurred");
        }
    }
}


