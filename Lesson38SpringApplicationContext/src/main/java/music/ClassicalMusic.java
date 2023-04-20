package music;

import lombok.Setter;

@Setter
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Beethoven symphony";
    }

}
