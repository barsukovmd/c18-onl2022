package homework.task5;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// * 5) Задан список сотрудников, которые хранятся в коллекции List<p3.Person>.
// * Объект p3.Person содержит имя и фамилию(по желанию другие данные)
// *  a) написать метод, который отображает все фамилии, начинающиеся на букву "Д".
// *     Внимание! метод должен вернуть объект Optional<String>.
// *  b*)Со звездочкой. Написать метод, который будет выводить в столбик первую букву фамилии и рядом количество сотрудников,
// *  у которых фамилия начинается с этой буквы.
// *  Пример: Антонов, Петров, Сидоров, Александров...
// *  на экран выведет:
// *  A - 2 сотрудника
// *  П - 1 сотрудник
// *  С - 1 сотрудник
// *
@ToString
@Getter
@Setter
@Builder
public class Person {
    private String name;
    private String surname;
    private int age;
}
