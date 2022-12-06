package militaryOffice;

import static militaryOffice.Sex.MALE;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public int getRecruits() {
        int count = 0;
        for (Person person : personRegistry.getPersons()) {
            if (checkRecruits(person)) {
                count++;
            }
        }
        return count;
    }

    public Person[] getRecruitsAlexander(String name) {
        Person[] persons = personRegistry.getPersons();
        Person[] personRecruits = new Person[persons.length];
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            if (checkRecruits(person) && person.getName().equalsIgnoreCase(name)) {
                personRecruits[i] = person;
            }
        }
        return personRecruits;
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

    public int getRecruitsExactAge(int from, int to) {
        int count = 0;
        for (Person persons : personRegistry.getPersons()) {
            if (persons.getAge() >= from && persons.getAge() <= to && checkRecruits(persons)) {
                count++;
            }
        }
        return count;
    }

    private boolean checkRecruits(Person person) {
        return person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals(MALE);
    }
}
