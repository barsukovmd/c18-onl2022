package reflection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@ToString
@Getter
@Setter
@Author(name = "Yauhen", surname = "Barsukov", age = 30)
public class Person {

    private int id;
    private String name;
    private String surname;
    private int age;
}
