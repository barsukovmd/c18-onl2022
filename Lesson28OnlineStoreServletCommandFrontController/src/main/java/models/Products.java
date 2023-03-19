package models;

import java.math.BigDecimal;

import lombok.*;

@ToString
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@Getter
@Setter
public class Products {
    private Long id;
    private String name;
    private String imageName;
    private String description;
    private BigDecimal price;
    private Long categoryId;
}
