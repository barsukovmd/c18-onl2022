package music;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Setter

public class MusicPlayer {

    private Music music;

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
