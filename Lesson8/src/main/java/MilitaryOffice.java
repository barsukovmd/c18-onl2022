import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class MilitaryOffice {
    private PersonRegistry personRegistry;
    private Person person;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    private boolean checkRecruits(Person person) {
        int age = person.getAge();
        return age >= 18 && age <= 27 && person.getSex().equals(Sex.MALE);
    }

    public Person[] getAllRecruits() {
        Person[] person = personRegistry.getPersons();
        Person[] allRecruits = new Person[person.length];
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            for (int j = 0; j < person.length; ) {
                Person people = person[i];
                person[i] = allRecruits[j];
                j++;
                if (checkRecruits(people)) {
                    person[i] = people;
                }
            }
        }
        return allRecruits;
    }

    public Person[] getRecruitsWithAlexander() {
        Person[] persons = personRegistry.getPersons();
        Person[] recruits = new Person[persons.length];
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            Person people = persons[i];
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
}


