package test;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Person {//final запрещает наследование!!!

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public void showInfo() {
        System.out.println("Name " + name + " Surname" + surname);
    }//final запрещает наследование!!! метода
}
