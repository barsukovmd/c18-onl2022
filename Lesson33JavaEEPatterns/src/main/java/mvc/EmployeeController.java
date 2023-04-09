package mvc;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeController {
    private Employee employee;
    private EmployeeView employeeView;

    public void updateEmployeeInfo() {
        employeeView.printEmployeeInfo(employee.getId(), getEmployee().getName());
    }
}
