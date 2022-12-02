import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    private boolean checkRecruits(Person person) {
        return person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals(Sex.MALE);
    }

    public Person[] getAllRecruits() {
        Person[] person = personRegistry.getPersons();
        Person[] allRecruits = new Person[person.length];
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            Person people = person[i];
            if (checkRecruits(people)) {
                person[i] = people;
            }
        }
        return allRecruits;
    }

    public Person[] getRecruitsWithAlexander() {
        Person[] person = personRegistry.getPersons();
        Person[] recruits = new Person[person.length];
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            Person people = person[i];
            if (checkRecruits(people) && people.getName().equalsIgnoreCase("Alexander")) {
                recruits[i] = people;
            }
        }
        return recruits;
    }

    public Person[] getRecruitsInMinsk() {
        Person[] persons = personRegistry.getPersons();
        Person[] personRecruits = new Person[persons.length];
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            if (checkRecruits(person) && person.getCity().equalsIgnoreCase("Minsk")) {
                personRecruits[i] = person;
            }
        }
        return personRecruits;
    }

    public int getRecruits25To27() {
        int count = 0;
        for (Person person : personRegistry.getPersons()) {
            if (person.getAge() >= 25 && person.getAge() <= 27 && checkRecruits(person)) {
                count++;
            }
        }
        return count;
    }
}


