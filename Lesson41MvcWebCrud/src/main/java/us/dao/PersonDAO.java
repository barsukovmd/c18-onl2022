package us.dao;

import java.util.ArrayList;
import java.util.List;
import us.models.Person;

public class PersonDAO {

    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "John"));
        people.add(new Person(++PEOPLE_COUNT, "Mike"));
        people.add(new Person(++PEOPLE_COUNT, "Lily"));
        people.add(new Person(++PEOPLE_COUNT, "Richard"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream()
                     .filter(person -> person.getId() == id)
                     .findAny()
                     .orElse(null);
    }
}
