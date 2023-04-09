package behavioral.memento;



import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString
public class Project {
    private String version;
    private LocalDateTime date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = LocalDateTime.now();
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDateTime();
    }
}
