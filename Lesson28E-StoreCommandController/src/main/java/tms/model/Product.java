package tms.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class Product implements Serializable {

    private Long id;
    private String name;
    private BigDecimal price;
    private ProductType type;
    private String info;
}