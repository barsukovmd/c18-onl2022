package militaryOffice;

import lombok.Getter;

@Getter

public class PersonRegistry {
    private Person[] persons;

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }
}
