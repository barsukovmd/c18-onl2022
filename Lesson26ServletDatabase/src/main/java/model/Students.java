package model;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Students {
    private City city;
    private int id;
    private String name;
    private String surname;
    private int age;
    private int course;
    private int cityId;

    public Students(City city, int id, String name, String surname, int age, int course, int cityId) {
        this.city = city;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.cityId = cityId;
    }

    public Students() {
    }
}
