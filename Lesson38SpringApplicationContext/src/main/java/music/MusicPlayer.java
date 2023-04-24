package music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class MusicPlayer {

    //    @Recourse find bean by name first
//    @Autowired find bean by type and @Qualifier first
    //Dependency injection is implemented with 3 different methods.
    //
    //Constructor Injection (recommended method)
    //Setter Injection (Property Injection)
    //Method Injection


    @Autowired
    @Qualifier("classical")
    private Music music;

    public String playMusic() {
        return "Playing: " + music.getSong();
    }
}

