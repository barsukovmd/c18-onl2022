import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void checkRecruitsAge(int age, boolean sex) {//не понимаю как достать возраст, пол и другие поля из другого для сравнения в методе??
        //или нам нужно просто заново новые задекларировать?
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            if (age > 18 && age < 27 && sex) {
                System.out.println(personRegistry + " is ready for army");
            } else if (age < 18 || age > 27) {
                System.out.println(personRegistry + " Not compatible for army");
            }
        }
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

