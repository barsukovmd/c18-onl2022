package models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Students {
    private int id;
    private String name;
    private String surname;
    private int age;
    private int course;
    private City city;

    public Students(int id, String name, String surname, int age, int course, City city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.city = city;
    }

    public Students() {
    }
}
