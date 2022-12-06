package militaryOffice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Person {
    private String name;
    private int age;
    private Sex sex;
    private String country;
    private String city;

    public Person(String name, int age, Sex sex, String country, String city) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.country = country;
        this.city = city;
    }
}
