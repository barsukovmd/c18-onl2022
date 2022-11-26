
public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void checkRecruits(PersonRegistry personRegistry, int age, boolean sex) {
        for (int i = 0; i < personRegistry.getPersons().length; i++) {//почему здесь не ставим
            if (age > 18 && age < 27 && sex) {
                System.out.println(personRegistry + " is ready for army");
            } else if (age < 18 || age > 27 || !sex) {
                System.out.println(personRegistry + " Not compatible for army");
            }
        }
    }
}

