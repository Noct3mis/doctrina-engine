package Viking;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public enum SoundEffect {
    FIRE("audios/fire.wav"),
    MURLOC("audios/murloc.wav");

    private final String audioFilePath;

    SoundEffect(String path) {
        this.audioFilePath = path;
    }

    public void play() {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResourceAsStream(audioFilePath));
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
