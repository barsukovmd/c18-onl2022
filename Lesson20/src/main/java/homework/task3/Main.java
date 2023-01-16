package homework.task3;

import java.util.HashMap;
import java.util.Map;

// 3) Создайте HashMap, содержащий пары значений - имя игрушки и объект игрушки (класс Toy).
//         Перебрать и распечатать набор из имен игрушек (keySet).
//         Перебрать и распечатать значения HashMap (values()).
//         Перебрать пары значений(entrySet()). Для каждого перебора создать свой метод(параметризованный)
public class Main {
    public static void main(String[] args) {
        Map<String, Toy> toyHashMapList = new HashMap<>();
        toyHashMapList.put("Car", new Toy("Ferrari"));
        toyHashMapList.put("Truck", new Toy("Man"));
        toyHashMapList.put("Bear", new Toy("TeddyBear"));
        toyHashMapList.put("Doll", new Toy("Barbie"));
        System.out.println("KeySet");
        toyHashMapList.keySet()
                .forEach(System.out::println);
        System.out.println("Values");
        toyHashMapList.values()
                .forEach(System.out::println);
        System.out.println("EntrySet");
        toyHashMapList.entrySet()
                .forEach(System.out::println);
    }
}
