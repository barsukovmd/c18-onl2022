package music;

import static music.MusicType.*;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class MusicPlayer {

    @Autowired
    @Qualifier("rap")
    private Music music;

//    @Qualifier("rock")
//
//    private Music musicRock;
//    @Qualifier("classical")
//    private Music musicClassic;
//    @Qualifier("rap")
//    private Music musicRap;

    //    @Recourse find bean by name first
//    @Autowired find bean by type and @Qualifier first
    //Dependency injection is implemented with 3 different methods.
    //
    //Constructor Injection (recommended method)
    //Setter Injection (Property Injection)
    //Method Injection
    public String playMusic(Music music) {
        return music.getSong();
    }
}

