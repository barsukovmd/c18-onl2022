package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Students {
    private City city;
    private int id;
    private String name;
    private String surname;
    private int age;
    private int course;
    private int cityId;
}
