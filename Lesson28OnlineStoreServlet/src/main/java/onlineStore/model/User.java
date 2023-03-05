package onlineStore.model;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class User {

    private String name;
    private String password;
}
