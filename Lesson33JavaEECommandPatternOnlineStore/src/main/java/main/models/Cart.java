package main.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cart {
    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private boolean cart;
    private boolean favourite;
}
