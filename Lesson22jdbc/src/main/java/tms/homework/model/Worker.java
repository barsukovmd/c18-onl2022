package tms.homework.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;


@ToString
@AllArgsConstructor
@Setter
@Getter
public class Worker {
    private int id;
    private String login;
    private double salary;
    private int age;
    private Timestamp localDate;
    private String description;
    private String name;
}
