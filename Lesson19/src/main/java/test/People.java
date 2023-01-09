package test;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@Builder
@ToString
public class People {
    private String name;
    private int age;
    private int id;
}
