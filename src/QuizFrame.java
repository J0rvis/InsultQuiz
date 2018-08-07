import java.awt.Color;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class QuizFrame extends JFrame {
	public QuizFrame() throws FontFormatException, IOException{
		//set the title do the frame has 
		setTitle("Astronomy Calculator");
		//create a TTTPanel
		QuizPanel panel = new QuizPanel();
		//add the Panel to the Frame
		add(panel);
        getRootPane().setBorder(BorderFactory.createMatteBorder(6, 6, 6, 6, Color.BLACK));
        panel.setBackground(Color.BLACK);
        setVisible(true);
		pack();
	}
}
