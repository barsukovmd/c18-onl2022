package Test;

public class Employee extends Person {
    private String company;

    public Employee(String name, String surname, String company) {
        super(name, surname);
        this.company = company;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Company " + company);
    }
}
