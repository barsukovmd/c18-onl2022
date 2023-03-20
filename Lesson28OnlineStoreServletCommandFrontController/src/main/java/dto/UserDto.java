package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Getter
@Setter
public class UserDto implements Serializable {
    private String name;
}
