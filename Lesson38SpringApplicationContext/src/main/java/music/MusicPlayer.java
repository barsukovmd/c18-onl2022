package music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("rock") Music music1,
                       @Qualifier("rap") Music music2,
                       @Qualifier("classical") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " +
                music2.getSong() + ", " +
                music3.getSong();
    }
}
//    @Recourse find bean by name first
//    @Autowired find bean by type and @Qualifier first
//Dependency injection is implemented with 3 different methods.
//
//Constructor Injection (recommended method)
//Setter Injection (Property Injection)
//Method Injection
