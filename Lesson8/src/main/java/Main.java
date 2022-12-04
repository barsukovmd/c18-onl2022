import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[30];
        persons[0] = new Person("Vitaliy", 20, Sex.MALE, "Belarus", "Minsk");
        persons[1] = new Person("Igor", 25, Sex.MALE, "Belarus", "Minsk");
        persons[2] = new Person("Vladimir", 18, Sex.MALE, "Belarus", "Minsk");
        persons[3] = new Person("Aleksandr", 40, Sex.MALE, "Belarus", "Minsk");
        persons[4] = new Person("Ignat", 27, Sex.MALE, "Belarus", "Minsk");
        persons[5] = new Person("Oleg", 23, Sex.MALE, "Belarus", "Minsk");
        persons[6] = new Person("Vitold", 42, Sex.MALE, "Belarus", "Minsk");
        persons[7] = new Person("Maksim", 38, Sex.MALE, "Belarus", "Minsk");
        persons[8] = new Person("Ramil", 21, Sex.MALE, "Belarus", "Minsk");
        persons[9] = new Person("Evgeniy", 29, Sex.MALE, "Belarus", "Minsk");
        persons[10] = new Person("Mihail", 30, Sex.MALE, "Belarus", "Minsk");
        persons[11] = new Person("Andrey", 22, Sex.MALE, "Belarus", "Minsk");
        persons[12] = new Person("Fedor", 26, Sex.MALE, "Belarus", "Minsk");
        persons[13] = new Person("Vitaliy", 27, Sex.MALE, "Belarus", "Minsk");
        persons[14] = new Person("Vlad", 24, Sex.MALE, "Belarus", "Minsk");
        MilitaryOffice militaryOffice = new MilitaryOffice(new PersonRegistry(persons));
        Person[] people = militaryOffice.getAllRecruits();
        Person[] getAlexander = militaryOffice.getRecruitsWithAlexander();
        Person[] recruitsMinsk = militaryOffice.getRecruitsInMinsk();
        int recruits25To27 = militaryOffice.getRecruits(25, 27);
        System.out.println(Arrays.toString(people));
        System.out.println(Arrays.toString(getAlexander));
        System.out.println(Arrays.toString(recruitsMinsk));
        System.out.println(recruits25To27);
    }
}