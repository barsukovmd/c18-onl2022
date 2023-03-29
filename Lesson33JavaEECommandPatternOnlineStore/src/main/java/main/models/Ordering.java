package main.models;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ordering {
    private String order;
    private LocalDateTime localDateTime;
    private List<Order> products;
}
