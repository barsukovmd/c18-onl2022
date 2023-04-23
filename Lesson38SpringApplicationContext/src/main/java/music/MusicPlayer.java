package music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    //    @Recourse find bean by name first
//    @Autowired find bean by type and @Qualifier first
    private final ClassicalMusic classicalMusic;
    private final RockMusic rockMusic;
    private final RapMusic rapMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
//        System.out.println("Playing: " + rockMusic.getSong());
//        System.out.println("Playing: " + rapMusic.getSong());
    }
}
