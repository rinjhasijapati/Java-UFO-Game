import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

public class HelicopterSound {
    public static void playCrashSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("crash-6711.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error playing sound: " + ex.getMessage());
        }
    }


}
