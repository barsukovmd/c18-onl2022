package main.models;

import java.time.LocalDateTime;

import lombok.*;

@Builder
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Order {
    private String id;
    private LocalDateTime localDateTime;
    private Product product;
    private Integer productCount;

    public Order(LocalDateTime localDateTime, Product product, Integer productCount) {
        this.localDateTime = localDateTime;
        this.product = product;
        this.productCount = productCount;
    }
}
