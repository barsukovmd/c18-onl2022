package tms.homework.task1.jdbc.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class City {
    private String cityName;
    private int cityId;
}
