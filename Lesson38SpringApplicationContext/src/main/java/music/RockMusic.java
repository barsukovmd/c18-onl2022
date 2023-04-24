package music;

import static music.MusicType.ROCK;

import java.util.List;
import org.springframework.stereotype.Component;

@Component("rock")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Queens Bohemian Rhapsody";
    }
}
