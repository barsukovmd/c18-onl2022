import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;


@Setter
@Getter
class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public String checkRecruitsAge() {
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            Person person = personRegistry.getPersons()[i];
            int personAge = person.getAge();
            boolean personSex = person.isSex();
            if (personAge > 18 && personAge < 27 && personSex) {
                return personRegistry + " is ready for army";
            } else if (personAge < 18 || personAge > 27) {
                return personRegistry + " Not compatible for army";
            }
        }
        return Arrays.toString(personRegistry.getPersons());
    }

    public void checkRecruitsAge25To27(int age) {
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            if (age >= 25 && age <= 27) {
                System.out.println(personRegistry + " is ready for army");
            } else {
                System.out.println(personRegistry + " Not compatible for army");
            }
        }
    }

    public void checkRecruitsName(String name) {
        int count = 0;
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            count++;
            if (name.equals("Aleksandr")) {
                System.out.println(personRegistry + " with Aleksander name" + count);
            } else {
                System.out.println(personRegistry + " not Aleksander names");
            }
        }
    }

    public void checkRecruitsAddress(String address) {
        if (address.equals("Minsk")) {
            System.out.println(personRegistry + "Minsk");
        } else {
            System.out.println(personRegistry + " not from Minsk");
        }
    }
}

