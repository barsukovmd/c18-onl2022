package music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
//        Music music1 = context.getBean("classic", ClassicalMusic.class);
//        Music music2 = context.getBean("rock", RockMusic.class);
//        Music music3 = context.getBean("rapMusic", RapMusic.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        MusicPlayer musicPlayer3 = new MusicPlayer(music3);
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();
//        musicPlayer3.playMusic();
        //        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();
//        boolean comparison = musicPlayer1 == musicPlayer2;
//        musicPlayer1.setVolume(10);
//        System.out.println(musicPlayer1.getVolume());
//        System.out.println(musicPlayer2.getVolume());
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
//        System.out.println(comparison);
//        System.out.println("--------------------");
    }
}
