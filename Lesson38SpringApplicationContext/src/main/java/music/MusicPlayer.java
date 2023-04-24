package music;

import static music.MusicType.*;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RapMusic rapMusic;
    private RockMusic rockMusic;

    //    @Recourse find bean by name first
//    @Autowired find bean by type and @Qualifier first
    //Dependency injection is implemented with 3 different methods.
    //
    //Constructor Injection (recommended method)
    //Setter Injection (Property Injection)
    //Method Injection

    @Autowired
    private Music music;

    public String playMusic(MusicType musicType) {
        if (musicType == ROCK) {
            return "Playing: " + music.getSong();
        } else if (musicType == RAP) {
            return "Playing: " + music.getSong();
        } else {
            return music.getSong();
        }
    }
}

