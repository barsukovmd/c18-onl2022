package homework.task5;

import java.util.ArrayList;
import java.util.List;

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
public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(0, Person.builder()
                .age(24)
                .name("Александр")
                .surname("Дегтярев")
                .build());

        personList.add(1, Person.builder()
                .age(23)
                .name("Михаил")
                .surname("Мишунин")
                .build());

        personList.add(2, Person.builder()
                .age(23)
                .name("Василий")
                .surname("Деревянко")
                .build());

        personList.add(3, Person.builder()
                .age(23)
                .name("Мария")
                .surname("Шипелина")
                .build());

        personList.add(4, Person.builder()
                .age(23)
                .name("Иван")
                .surname("Демин")
                .build());

        personList.add(5, Person.builder()
                .age(23)
                .name("Наталья")
                .surname("Драник")
                .build());

        personList.add(6, Person.builder()
                .age(23)
                .name("Валентин")
                .surname("Миклошевич")
                .build());

        personList.stream()
                .filter(person -> person.getSurname().startsWith("Д"))
                .forEach(System.out::println);
    }
}
