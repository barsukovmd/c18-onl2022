package militaryOffice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor

public class Person {
    private String name;
    private int age;
    private Sex sex;
    private String country;
    private String city;
}
