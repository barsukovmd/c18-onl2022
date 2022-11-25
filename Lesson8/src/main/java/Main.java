public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[30];
        PersonRegistry personRegistry = new PersonRegistry(person);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        militaryOffice.toString(personRegistry);
        person[0] = new Person("Vitaliy", 20, true, "Belarus", "Minsk");
        person[1] = new Person("Igor", 25, true, "Belarus", "Minsk");
        person[2] = new Person("Vladimir", 18, true, "Belarus", "Minsk");
        person[3] = new Person("Aleksandr", 40, true, "Belarus", "Minsk");
        person[4] = new Person("Ignat", 27, true, "Belarus", "Minsk");
        person[5] = new Person("Oleg", 23, true, "Belarus", "Minsk");
        person[6] = new Person("Vitold", 42, true, "Belarus", "Minsk");
        person[7] = new Person("Maksim", 38, true, "Belarus", "Minsk");
        person[8] = new Person("Ramil", 21, true, "Belarus", "Minsk");
        person[9] = new Person("Evgeniy", 29, true, "Belarus", "Minsk");
        person[10] = new Person("Mihail", 30, true, "Belarus", "Minsk");
        person[11] = new Person("Andrey", 22, true, "Belarus", "Minsk");
        person[12] = new Person("Fedor", 26, true, "Belarus", "Minsk");
        person[13] = new Person("Vitaliy", 27, true, "Belarus", "Minsk");
        person[14] = new Person("Vlad", 24, true, "Belarus", "Minsk");
    }
}
