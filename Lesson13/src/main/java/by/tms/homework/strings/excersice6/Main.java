package by.tms.homework.strings.excersice6;

import java.util.ArrayList;

public class Main {
    //     * 6)Создать класс Employee, у которого есть переменные класса - String fullname, double salary.
//     * Создать массив содержащий несколько объектов этого типа. Создать класс Report (по возможности интерфейс),
//     * который будет содержать метод generateReport, в котором выводится информация о зарплате всех сотрудников.
//     * Используйте форматировании строк(https://javarush.ru/quests/lectures/questmultithreading.level02.lecture06)
//     * Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой и по одной первой букве имени и отчества через точки.
//     * Пример: | Л.Н. Толстой		|		200.34|
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Michael Douglas", 400.298786));
        employees.add(new Employee("Nick Douglas", 300.188756789));
        employees.add(new Employee("Mich Douglas", 290.298769));
        employees.add(new Employee("Ron Douglas", 500.1687659));
        Report report = new ReportGenerator();
        report.generateReport(employees);
    }
}
