package homework.task4;

import java.util.Arrays;
import java.util.List;

// *
// * 4) Создаем класс Car с полями number (номер авто) и year (год выпуска).
// * List<Car> cars = Arrays.asList(
// *             new Car("AA1111BX", 2007),
// *             new Car("AK5555IT", 2010),
// *             new Car(null, 2012),
// *             new Car("", 2015),
// *             new Car("AI3838PP", 2017));
// *
// * Необходимо вывести все не пустые номера машин, выпущенных после 2010 года
// *
public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));
        cars.stream()
                .filter(car -> car.getAutoNumber() != null && !car.getAutoNumber().isEmpty())//почему-то не работает isBlank?
                .filter(car -> car.getYear() > 2010)
                .map(Car::toString)
                .forEach(System.out::println);
    }

}
