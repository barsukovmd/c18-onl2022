package models;

import java.io.Serializable;
import java.util.List;

import lombok.*;
import lombok.ToString;

@ToString
@Builder
@EqualsAndHashCode
@Getter
@Setter
public class Category implements Serializable {
    private Long id;
    private String name;
    private String imageName;
    private List<Products> productsList;

    public Category(Long id, String name, String imageName) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
    }
}
