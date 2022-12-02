package test;

public class CustomEmployee extends Employee {
    private String customCharacter;

    public CustomEmployee(String name, String surname, String company, String customCharacter) {
        super(name, surname, company);
        this.customCharacter = customCharacter;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Custom employee" + getName() + "" + getSurname());
    }
}
