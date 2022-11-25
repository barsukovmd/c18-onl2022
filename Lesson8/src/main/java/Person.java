public class Person {
    private String name;
    private int age;
    private boolean sex;
    private final String country;
    private final String city;

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

    public String checkRecruits(MilitaryOffice militaryOffice) {
        boolean sex = true;
        if (age > 18 && age < 27 && sex) {
            return militaryOffice.toString();
        } else {
            return null;
        }
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
