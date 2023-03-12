package behavioral.memento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Save {
    private String version;
    private LocalDateTime dateTime;

    public Save(String version) {
        this.version = version;
        this.dateTime = LocalDateTime.now();
    }
}
