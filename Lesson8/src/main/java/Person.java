import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
    private String name;
    private int age;
    private Sex sex;
    private String country;
    private String city;

    public Person(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public Person(String name, int age, Sex sex, String country, String city) {
        this(country, city);
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
