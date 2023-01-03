package test;

import java.util.TreeSet;

public class MainComparator {
    public static void main(String[] args) {
        PersonNameComparator personComparator = new PersonNameComparator();
        TreeSet<Person> person = new TreeSet<>(personComparator);
        person.add(new Person("Mike", 44));
        person.add(new Person("Nikky", 38));
        person.add(new Person("Mike", 20));
        for (Person person1 : person) {
            System.out.println(person1);
        }
    }
}
