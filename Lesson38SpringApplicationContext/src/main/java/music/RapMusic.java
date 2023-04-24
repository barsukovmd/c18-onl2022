package music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component("rap")
public class RapMusic implements Music {

    private final List<String> rapMusics = new ArrayList<>();

    @Override
    public String getSong() {
        Random random = new Random(rapMusics.size());
        rapMusics.add("Eminem marshall's mothers");
        rapMusics.add("Eminem Mockingbird");
        rapMusics.add("Eminem Sing for the bird");
        return random.toString();
    }
}
