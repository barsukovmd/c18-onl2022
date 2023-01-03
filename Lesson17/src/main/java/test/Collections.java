package test;

import java.util.ArrayList;
import java.util.Iterator;

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
    }
}
