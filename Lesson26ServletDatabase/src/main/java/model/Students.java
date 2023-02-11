package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
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
