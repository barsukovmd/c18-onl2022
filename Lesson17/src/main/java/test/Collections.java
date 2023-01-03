package test;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> cities2 = new ArrayList<>();
        cities2.add("Berlin");
        cities2.add("Munich");
        cities2.add("London");
        cities2.add("Minsk");
        Iterator<String> city1 = cities2.iterator();
        while (city1.hasNext()) {
            System.out.println(city1.next());
        }
        System.out.println("!!!1");
        TreeSet<String> cities1 = new TreeSet<>();//в порядке алфавита
        cities1.add("Berlin");
        cities1.add("Munich");
        cities1.add("London");
        cities1.add("Minsk");
        System.out.printf("Number of cities are %d \n", cities1.size());
        for (String s : cities1) {
            System.out.println(s);
        }
        Map<Integer, String> city = new HashMap<>(); // в порядке добавления
        city.put(38, "Brooklyn");
        city.put(33, "Miami");
        city.put(58, "New Jersey");
        for (Map.Entry<Integer, String> item : city.entrySet()) {
            System.out.printf("Number of cities are %d \n", item.getKey(), item.getValue());
        }
        System.out.println("!!!");
        Map<Integer, String> cities = new LinkedHashMap<>();//в порядке добавления
        cities.put(111, "Brooklyn");
        cities.put(3, "Miami");
        cities.put(32, "New Jersey");
        for (Map.Entry<Integer, String> item : cities.entrySet()) {
            System.out.printf("Number of cities are %d \n", item.getKey(), item.getValue());
        }
        System.out.println("!!!");
        Map<Integer, String> states = new TreeMap<>();//по возрастанию ключей
        states.put(2, "Utah");
        states.put(1, "New York");
        states.put(11, "Florida");
        states.put(2, "Oklahoma");
        for (Map.Entry<Integer, String> state : states.entrySet()) {
            System.out.printf("Number of cities are %d \n", state.getKey(), state.getValue());
        }
    }
}
