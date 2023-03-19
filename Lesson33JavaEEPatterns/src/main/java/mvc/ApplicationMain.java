package mvc;

public class ApplicationMain {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Felix");
        EmployeeView employeeView = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, employeeView);
        controller.updateEmployeeInfo();
        employee.setName("Jack");
        employee.setId(3);
        controller.setEmployee(employee);
        controller.updateEmployeeInfo();
    }
}
