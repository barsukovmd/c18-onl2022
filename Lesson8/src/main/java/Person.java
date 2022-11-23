public class Person {
    protected String name;
    protected int age;
    protected boolean sex;//false
    protected String country;
    protected String city;

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
