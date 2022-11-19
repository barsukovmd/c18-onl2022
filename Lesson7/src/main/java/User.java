//* 2) Создать в классе User несколько конструкторов(сделано). Создать объект этого класса,
//     *использовав один из них.
//     * В этом конструкторе сделать вызов другого конструктора этого же класса.
//     */??????????????????
public class User {
    //характеристики, глобальные переменные
    public String name, surname;
    public String sex;
    public int age;

    public User(String name, String surname, String sex, int age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
    }

    public User(String name, String surname, String sex) {

        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public User(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }


    public void myNameSurname(String name, String surname) {
        System.out.println(name + surname);
    }

    @Deprecated
    public void mySex(String sex) {
        System.out.println(sex);
    }

    public void myAge(int age) {
        System.out.println(age);
    }

    public void myPersonInfo(String name, String surname, int age, String sex) {
        System.out.println(name + " " + surname + " " + age + " " + sex);
    }
}

