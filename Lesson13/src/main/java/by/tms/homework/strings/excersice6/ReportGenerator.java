package by.tms.homework.strings.excersice6;

import lombok.Getter;

import java.util.List;

@Getter
public class ReportGenerator implements Report {
    @Override
    public void generateReport(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("|-%20s |%20.2f| \n" + employee.getFullName() + +employee.getSalary());
//Почему так не разрешает сделать?
        }
    }
}
