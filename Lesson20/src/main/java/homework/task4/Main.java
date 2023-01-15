package homework.task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

//
//        4) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//                Создать класс Категория, имеющий переменные имя и множество товаров.
//                Создать несколько объектов класса Категория.
//                Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
//                Используем классы компараторы для каждого вида сортировки.
//               */
public class Main {
    public static void main(String[] args) {
        Set<Category> categories = new LinkedHashSet<>();
        categories.add(new Category("Electronics", Arrays.asList(
                new Product("Earphones", 300, 10),
                new Product("TV", 450, 9),
                new Product("Lamp", 100, 11),
                new Product("Phone", 320, 10))));

        categories.add(new Category("Household chemicals", Arrays.asList(
                new Product("Washing powder", 90, 11),
                new Product("Shampoo", 50, 20),
                new Product("Cleaning", 40, 15))));

        categories.stream()
                .flatMap(category -> category.getProducts().stream())
                .sorted(Comparator.comparing(Product::getName))
                .toList()
                .forEach(System.out::println);

        categories.stream()
                .flatMap(category -> category.getProducts().stream())
                .sorted(Comparator.comparing(Product::getPrice))
                .toList()
                .forEach(System.out::println);

        categories.stream()
                .flatMap(category -> category.getProducts().stream())
                .sorted(Comparator.comparing(Product::getRate))
                .toList()
                .forEach(System.out::println);
    }
}
