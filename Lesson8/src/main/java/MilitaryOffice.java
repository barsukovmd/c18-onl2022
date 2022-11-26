import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void checkRecruits(PersonRegistry personRegistry, int age, String sex, String address, String name) {
        for (int i = 0; i < personRegistry.getPersons().length; i++) {//почему здесь не ставим persons.length??
            if (age > 18 && age < 27 && sex.equals("male")) {
                System.out.println(personRegistry + " is ready for army");
            } else if (age < 18 || age > 27 || !sex.equals("male")) {
                System.out.println(personRegistry + " Not compatible for army");
            }
            if (address.equals("Minsk")) {
                System.out.println(personRegistry + "Minsk");
            } else {
                System.out.println(personRegistry + " not from Minsk");
            }
            if (name.equals("Aleksandr")) {
                System.out.println(personRegistry + " with Aleksander name");
            } else {
                System.out.println(personRegistry + " not Aleksander names");
            }
        }
    }
}

