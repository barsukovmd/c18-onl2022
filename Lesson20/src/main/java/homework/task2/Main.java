package homework.task2;

import java.util.ArrayList;
import java.util.List;

// 2) Создать коллекцию, содержащую объекты HeavyBox.
//        Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
//         Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
public class Main {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxesList = new ArrayList<>();
        heavyBoxesList.add(new HeavyBox(300));
        heavyBoxesList.add(new HeavyBox(270));
        heavyBoxesList.add(new HeavyBox(290));
        heavyBoxesList.add(new HeavyBox(310));
        heavyBoxesList.add(new HeavyBox(315));
        heavyBoxesList.add(new HeavyBox(150));
        heavyBoxesList.add(new HeavyBox(299));
        heavyBoxesList.add(new HeavyBox(301));
        System.out.println("List of boxes 300g or less");
        heavyBoxesList.stream()
                .filter(heavyBox -> heavyBox.getMass() <= 300)
                .toList()
                .forEach(System.out::println);
        System.out.println("List of boxes more than 300g");
        heavyBoxesList.stream()
                .filter(heavyBox -> heavyBox.getMass() > 300)
                .toList()
                .forEach(System.out::println);
    }
}
