package main.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Product {
    private Long id;
    private String orderName;
    private BigDecimal price;
    private ProductType productType;
    private String info;
}
