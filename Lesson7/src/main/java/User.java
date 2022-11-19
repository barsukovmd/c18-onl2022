public class User {
    String name;
    String surname;
    String sex;
    int age;

    public User() {

    }

    public void setName(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println("Name: " + name + " " + "Surname: " + surname);
    }

    @Deprecated
    public void setSex(String sex) {
        this.sex = sex;
        System.out.println("Sex: " + sex);
    }

    public void setAgeIncrease(int age) {
        this.age = age;
        System.out.println("Age: " + age);
    }

    public void setPersonInfo(String name, String surname, String sex, int age) {
        setName(name, surname);
        setSex(sex);
        setAgeIncrease(age);
    }
}
