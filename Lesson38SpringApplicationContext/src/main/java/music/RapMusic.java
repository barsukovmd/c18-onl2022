package music;

import org.springframework.stereotype.Component;

@Component("rap")
public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "Eminem marshall's mothers";
    }
}
