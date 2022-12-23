package by.tms.homework.strings.excersice6;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Employee {
    private String fullName;
    private double salary;

}
