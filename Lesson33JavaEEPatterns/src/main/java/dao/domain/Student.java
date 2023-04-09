package dao.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@ToString
public class Student {

    private int id;
    private String name;
    private String surname;
    private int course;
}
