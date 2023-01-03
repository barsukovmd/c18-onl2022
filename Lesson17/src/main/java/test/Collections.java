package test;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("Munich");
        cities.add("London");
        cities.add("Minsk");
        Iterator<String> city1 = cities.iterator();
        while (city1.hasNext()) {
            System.out.println(city1.next());
        }
        TreeSet<String> cities1 = new TreeSet<>();
        cities1.add("Berlin");
        cities1.add("Munich");
        cities1.add("London");
        cities1.add("Minsk");
        System.out.printf("Number of cities are %d \n", cities1.size());
        for (String s : cities1) {
            System.out.println(s);
        }
        Map<Integer, String> city = new HashMap<>();
        city.put(1, "Brooklyn");
        city.put(2, "Miami");
        city.put(3, "New Jersey");
        for (Map.Entry<Integer, String> item : city.entrySet()) {
            System.out.printf("Number of cities are %d \n", item.getKey(), item.getValue());
        }
    }
}
