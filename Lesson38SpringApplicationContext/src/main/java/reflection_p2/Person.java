package reflection_p2;

import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Author(name = "Yauhen", age = 30)
public class Person {

    private String name;
    private int age;
}
