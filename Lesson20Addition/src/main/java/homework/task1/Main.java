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

public class Main {

    public static void main(String[] args) {
        List<Cashier> cashDeskList = Arrays.asList(
                new Cashier("Cashier #1"),
                new Cashier("Cashier #2"),
                new Cashier("Cashier #3"));

        cashDeskList.stream()
                .flatMap(cashier -> cashier.getProductTypes(Buyer::new))//подскажите почему здесь не работает?
                .forEach(System.out::println);
    }
}


