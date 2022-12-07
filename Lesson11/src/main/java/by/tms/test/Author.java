package by.tms.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor

public class Author {

    private String name;

    public Author clone() throws CloneNotSupportedException {
        return (Author) super.clone();
    }
}

