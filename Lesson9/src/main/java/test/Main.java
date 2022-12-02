package test;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(" Jack", " Wolf");
        Employee employee = new Employee(" Nick", " Jet-sky", "Riverdale");
        person.showInfo();
        employee.showInfo();
        employee.setName("Nils");
        System.out.println(employee.getName());
        CustomEmployee customEmployee = new CustomEmployee("Rick", "Morales", "Raven", "White");
        customEmployee.showInfo();
    }
}
