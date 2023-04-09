package tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor
public class Ordering {

    private String order;
    private LocalDate date;
    private List<Product> products;
}