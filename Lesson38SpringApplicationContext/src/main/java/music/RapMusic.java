package music;

import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component("rapMusic")
public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "Eminem marshall's mothers";
    }
}
