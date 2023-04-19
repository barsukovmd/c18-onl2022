package music;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MusicPlayer {
    private Music music;
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
