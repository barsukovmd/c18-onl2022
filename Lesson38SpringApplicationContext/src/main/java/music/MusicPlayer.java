package music;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class MusicPlayer {

    private Music music;
    private String name;
    private int volume;

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
