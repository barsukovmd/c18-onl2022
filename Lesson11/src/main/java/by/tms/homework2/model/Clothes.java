package by.tms.homework2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public abstract class Clothes {
    private int size;
    private int price;
    private String color;
}
