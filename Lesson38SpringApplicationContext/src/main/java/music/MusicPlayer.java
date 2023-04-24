package music;

import static music.MusicType.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music music;

    //    @Recourse find bean by name first
//    @Autowired find bean by type and @Qualifier first
    //Dependency injection is implemented with 3 different methods.
    //
    //Constructor Injection (recommended method)
    //Setter Injection (Property Injection)
    //Method Injection
    @Autowired
    private MusicType musicType;

    public void playMusic(MusicType musicType) {
        if (musicType == ROCK) {
            music.getSong();
        } else if (musicType == RAP) {
            music.getSong();
        } else {
            music.getSong();
        }
    }
}

