package us.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import us.models.Person;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "John", "Mitchel", "email"));
        people.add(new Person(++PEOPLE_COUNT, "Mike", "Mitchel", "email"));
        people.add(new Person(++PEOPLE_COUNT, "Lily", "Mitchel", "email"));
        people.add(new Person(++PEOPLE_COUNT, "Richard", "Mitchel", "email"));
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
