package tms.homework.task1.jdbc.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class Student {
   private int id;
   private String name;
   private String surname;
   private int age;
   private int course;
    private City city;
}
