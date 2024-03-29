package militaryOffice;

import java.util.Arrays;

import static militaryOffice.Sex.*;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[15];
        persons[0] = new Person("Vitaliy", 20, MALE, "Belarus", "Minsk");
        persons[1] = new Person("Igor", 25, MALE, "Belarus", "Minsk");
        persons[2] = new Person("Vladimir", 18, MALE, "Belarus", "Minsk");
        persons[3] = new Person("Alexander", 40, MALE, "Belarus", "Minsk");
        persons[4] = new Person("Ignat", 27, MALE, "Belarus", "Minsk");
        persons[5] = new Person("Oleg", 23, MALE, "Belarus", "Minsk");
        persons[6] = new Person("Vitold", 42, MALE, "Belarus", "Minsk");
        persons[7] = new Person("Maksim", 38, MALE, "Belarus", "Minsk");
        persons[8] = new Person("Ramil", 21, MALE, "Belarus", "Minsk");
        persons[9] = new Person("Evgeniy", 29, MALE, "Belarus", "Minsk");
        persons[10] = new Person("Alexander", 20, MALE, "Belarus", "Minsk");
        persons[11] = new Person("Andrey", 22, MALE, "Belarus", "Minsk");
        persons[12] = new Person("Alexander", 26, MALE, "Belarus", "Minsk");
        persons[13] = new Person("Vitaliy", 27, MALE, "Belarus", "Minsk");
        persons[14] = new Person("Vlad", 24, MALE, "Belarus", "Minsk");
        System.out.println(Arrays.stream(persons).count());
        MilitaryOffice militaryOffice = new MilitaryOffice(new PersonRegistry(persons));
        Person[] alexander = militaryOffice.getRecruitsByName("Alexander");
        System.out.println("Recruits with name Alexander are  " + Arrays.toString(alexander));
        System.out.println("!!!");
        Person[] minskRecruits = militaryOffice.getRecruitsInExactCity();
        System.out.println(Arrays.toString((minskRecruits)) + " from Minsk");
        int allRecruits = militaryOffice.getRecruits();
        System.out.println(allRecruits);
        int recruitsExactAge = militaryOffice.getRecruitsExactAge(25, 27);
        System.out.println(recruitsExactAge);
    }
}
