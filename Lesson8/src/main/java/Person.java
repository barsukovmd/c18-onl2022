import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Person {
    private String name;
    private int age;
    private boolean sex;
    private String country;
    private String city;

    public Person(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public Person(String name, int age, boolean sex, String country, String city) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.country = country;
        this.city = city;
    }

       /* System.out.println("Please enter your age");
        age = scanner.nextInt();
        System.out.println("Please enter your sex");
        sex = Boolean.parseBoolean(scanner.next());
        System.out.println("Please enter your name");
        name = scanner.next();
        System.out.println("Please enter your city and Country");
        city = scanner.next();
        country = scanner.next();
        System.out.println(name + " " + age + " ages " + sex + " sex " + " from " + city + " " + country);*/

}
