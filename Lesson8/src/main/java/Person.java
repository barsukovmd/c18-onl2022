public class Person {
    private String name;
    private int age;
    private boolean sex;//false
    private String country;
    private String city;

    public Person(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public Person(String name, int age, boolean sex, String country, String city) {
        this(country, city);
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
