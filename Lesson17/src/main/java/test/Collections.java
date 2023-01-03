package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("Munich");
        cities.add("London");
        cities.add("Minsk");
        Iterator<String> city = cities.iterator();
        while (city.hasNext()) {
            System.out.println(city.next());
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
    }
}
