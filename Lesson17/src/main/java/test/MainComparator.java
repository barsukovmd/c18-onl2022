package test;

import java.util.TreeSet;

public class MainComparator {
    public static void main(String[] args) {
        PersonNameComparator personComparator = new PersonNameComparator();
        TreeSet<Person> person = new TreeSet<>(personComparator);
        person.add(new Person("Mike"));
        person.add(new Person("Nikky"));
        person.add(new Person("Mike"));

    }
}
