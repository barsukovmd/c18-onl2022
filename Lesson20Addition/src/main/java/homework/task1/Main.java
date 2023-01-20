package homework.task1;
///**
// * Напишите программу, моделирующую кассы в магазине.
// * Существует несколько касс, работающих одновременно.
// * Каждый покупатель — отдельный поток.
// * Общее количество покупателей может быть больше, чем количество касс,
// * но одновременно не может обрабатываться больше покупателей, чем имеется рабочих касс.
// * У каждого покупателя есть набор товаров, которые должны быть выведены на консоль в процессе обслуживания.
// */

import java.util.Arrays;
import java.util.List;

import static homework.task1.ProductType.values;

public class Main {
    public static void main(String[] args) {
        List<Cashier> cashDeskList = Arrays.asList(
                new Cashier("Cashier #1"),
                new Cashier("Cashier #2"),
                new Cashier("Cashier #3"),
                new Cashier("Cashier #4"),
                new Cashier("Cashier #5"));

        for (int i = 0; i <= 15; i++) {
            new Buyer("\t" + "Number " + i,
                    cashDeskList.stream().toList(),
                    Arrays.stream(values()).toList());
        }
    }
}


