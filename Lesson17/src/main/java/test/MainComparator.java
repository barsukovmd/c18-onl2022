package test;

import java.util.Comparator;
import java.util.TreeSet;

public class MainComparator {
    public static void main(String[] args) {
//        PersonNameComparator personComparator = new PersonNameComparator();
        Comparator<Person> personComparator = new PersonAgeComparator().thenComparing(new PersonNameComparator());
        //сравнение происходит вначале по списку, что указываем первым в экземпляре объекта
        TreeSet<Person> person = new TreeSet<>(personComparator);
        person.add(new Person("Mike", 44));
        person.add(new Person("Rich", 38));
        person.add(new Person("Kristy", 45));
        for (Person person1 : person) {
            System.out.println(person1.getAge() + " " + person1.getName());
        }
    }
}
