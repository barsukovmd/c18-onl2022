@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[30];
        persons[0] = new Person("Vitaliy", 20, true, "Belarus", "Minsk");
        persons[1] = new Person("Igor", 25, true, "Belarus", "Minsk");
        persons[2] = new Person("Vladimir", 18, true, "Belarus", "Minsk");
        persons[3] = new Person("Aleksandr", 40, true, "Belarus", "Minsk");
        persons[4] = new Person("Ignat", 27, true, "Belarus", "Minsk");
        persons[5] = new Person("Oleg", 23, true, "Belarus", "Minsk");
        persons[6] = new Person("Vitold", 42, true, "Belarus", "Minsk");
        persons[7] = new Person("Maksim", 38, true, "Belarus", "Minsk");
        persons[8] = new Person("Ramil", 21, true, "Belarus", "Minsk");
        persons[9] = new Person("Evgeniy", 29, true, "Belarus", "Minsk");
        persons[10] = new Person("Mihail", 30, true, "Belarus", "Minsk");
        persons[11] = new Person("Andrey", 22, true, "Belarus", "Minsk");
        persons[12] = new Person("Fedor", 26, true, "Belarus", "Minsk");
        persons[13] = new Person("Vitaliy", 27, true, "Belarus", "Minsk");
        persons[14] = new Person("Vlad", 24, true, "Belarus", "Minsk");
        PersonRegistry personRegistry = new PersonRegistry(persons);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        // militaryOffice.getPersonRegistry();
    }
}
