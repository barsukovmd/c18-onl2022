package music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component("rock")
public class RockMusic implements Music {
    private final List<String> rockMusics = new ArrayList<>();
    @Override
    public String getSong() {
        Random random = new Random(rockMusics.size());
        rockMusics.add("Queen Bohemian Rhapsody");
        rockMusics.add("Queen Another one Bytes the Dust");
        rockMusics.add("Queen We Will Rock you");
        return random.toString();
    }
}
