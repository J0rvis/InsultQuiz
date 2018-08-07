import java.awt.Color;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class QuizDriver {
	public static void main(String[] args) throws FontFormatException, IOException, Exception {
		QuizFrame frame = new QuizFrame();
		// make it so the Frame closes when the x is clicked
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.BLACK);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setVisible(true);

		
		// Music tutorial
//		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\User\\Desktop\\Current\\Speech UK\\Astro_Speech.wav"));
//		Clip ukIntro = AudioSystem.getClip();
//		ukIntro.open(audioInputStream);
//		FloatControl gainControl = (FloatControl) ukIntro.getControl(FloatControl.Type.MASTER_GAIN);
//		gainControl.setValue(6.0f);
//		ukIntro.start();
//		
//		AudioInputStream audioMusicStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\User\\Desktop\\CS LEARN\\Educational Vids Java\\Tutorial Music\\Quieter Tutorial Music.wav"));
//		Clip clipMusic = AudioSystem.getClip();
//		clipMusic.open(audioMusicStream);
//		FloatControl gainControlMusic = (FloatControl) clipMusic.getControl(FloatControl.Type.MASTER_GAIN);
//		gainControlMusic.setValue(-10.0f);
//		clipMusic.start();
	}
}
