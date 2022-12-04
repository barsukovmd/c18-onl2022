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

    public Person[] getRecruits(String name) {
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

    public int getRecruits(int from, int to) {
        int count = 0;
        for (Person person : personRegistry.getPersons()) {
            from = 25;
            to = 27;
            if (person.getAge() >= from && person.getAge() <= to && checkRecruits(person)) {
                count++;
            }
        }
        return count;
    }

    private boolean checkRecruits(Person person) {
        return person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals(MALE);
    }
}
