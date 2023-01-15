package homework.task4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

//        4) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//                Создать класс Категория, имеющий переменные имя и множество товаров.
//                Создать несколько объектов класса Категория.
//                Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
//                Используем классы компараторы для каждого вида сортировки.
//               */
@Builder
@ToString
@Getter
@AllArgsConstructor
public class Product {
    private String name;
    private long price;
    private int rate;
}
