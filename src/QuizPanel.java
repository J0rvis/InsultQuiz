import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class QuizPanel extends JPanel {

	private JLabel info;

	// beginning screen
	private JPanel panel; // panel for everything

	private JPanel startPanel; // start option
	private JPanel subjectPanel; // first options: math, English, science, music, Spanish, computer;

	// startPanel
	private JButton openFullPage;
	private JLabel start;
	private JLabel clickStart;

	// return button
	private JButton math, english, science, music, spanish, computer;
	private JLabel mLabel, eLabel, sLabel, muLabel, spLabel, cLabel;

	private JButton back1, back2, back3, back4, back5, back6, back7, back8;

	private Font font1 = new Font("Impact", Font.BOLD, 50);
	private Font font2 = new Font("Impact", Font.BOLD, 200);
	private Font fontSmall = new Font("Impact", Font.PLAIN, 30);
	private Font fontSmaller = new Font("Impact", Font.PLAIN, 20);

	// FIRST
	// first options: Math, Computer Science, Spanish, Random
	JLabel buffer;

	// private JTextArea inCode;
	// private JLabel askWeight;
	// private String outWeight;
	private JButton submit;

	public QuizPanel() throws FontFormatException, IOException {
		autoStartPanel(); // throw up first panel cleanly

	}

	private class OpeningAction implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JButton b = (JButton) event.getSource();
			if (b.equals(openFullPage)) {

				subjectMenu();
				add(subjectPanel, BorderLayout.CENTER);
				System.out.println("Opened full page");

			} else if (b.equals(math)) {
				
				System.out.println("MATH");

			} else if (b.equals(english)) {

			} else if (b.equals(science)) {

			} else if (b.equals(computer)) {

			} else if (b.equals(music)) {

			} else if (b.equals(spanish)) {

			}
		}
	}

	// first options: Math, Computer Science, Spanish, Random
	private class CalcOptionAction implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JButton b = (JButton) event.getSource();
			// if (b.equals(first)) {

		}
	}

	private class FirstOptionAction implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JButton b = (JButton) event.getSource();
			// if (b.equals(mercury)) {

		}
	}

	private class ReturnAction implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JButton b = (JButton) event.getSource();
			if (b.equals(back1)) {
				

			} else if (b.equals(submit)) {

			}
		}
	}

	public void cleanSlate(String jName) {

		if (jName.equals("startPanel")) {
			startPanel.setEnabled(false);
			startPanel.setVisible(false);
		} else if(jName.equals("subjectPanel")) {
			subjectPanel.setEnabled(false);
			subjectPanel.setVisible(false);
		}
	}


	/*public void removeAllPanels() {
		startPanel.setEnabled(false);
		startPanel.setVisible(false);
		subjectPanel.setEnabled(false);
	 	subjectPanel.setVisible(false);
	}*/


	public void autoStartPanel() {
		// Automatically set up the first panel
		setBackground(Color.BLACK);
		setLayout(new BorderLayout());
		startPanel = new JPanel();
		startPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		ActionListener opening = new OpeningAction();

		// text and image
		ImageIcon imageOpen = new ImageIcon("C:\\Users\\glitchGoddess\\Desktop\\Life\\quiz\\quiz images\\testJPG.jpg");// glitchGoddess\Desktop\Life\quiz\quiz
																														// images\testJPG.jpg"
		openFullPage = new JButton("", imageOpen);
		openFullPage.setFont(font2);
		openFullPage.addActionListener(opening);
		start = new JLabel("<html> &ensp;Insult <br> &ensp;Quiz<br><br> </html>", SwingConstants.LEFT);
		start.setForeground(Color.WHITE);
		start.setFont(font2);
		openFullPage.add(start);

		clickStart = new JLabel(
				"<html><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br> <br><U>Click Anywhere to Start Quiz</U><br> <br> </html>",
				SwingConstants.CENTER);
		clickStart.setForeground(Color.WHITE);
		clickStart.setFont(fontSmall);
		openFullPage.add(clickStart);

		// getting height/ width of screen using toolkit
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// the screen height
		screenSize.getHeight();

		// the screen width
		screenSize.getWidth();

		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		openFullPage.setPreferredSize(new Dimension(screenWidth, screenHeight));

		startPanel.add(openFullPage, BorderLayout.NORTH);
		openFullPage.setEnabled(true);
		openFullPage.setVisible(true);

		startPanel.setBackground(Color.BLACK);
		add(startPanel, BorderLayout.CENTER);

		startPanel.setEnabled(true);
		startPanel.setVisible(true);
	}

	public void subjectMenu() {
		// Automatically set up the first panel
		// System.out.println("0");
		startPanel.setEnabled(false);
		startPanel.setVisible(false);
		// System.out.println("1");
		// subjectPanel.setEnabled(true);
		// System.out.println("2");
		// subjectPanel.setVisible(true);
		// System.out.println("3");
		setBackground(Color.BLACK);
		setLayout(new BorderLayout());
		subjectPanel = new JPanel();
		subjectPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		ActionListener opening = new OpeningAction();

		JLabel label = new JLabel(
				new ImageIcon("C:\\Users\\glitchGoddess\\Desktop\\Life\\quiz\\quiz images\\snowTest.gif"));
		 math = new JButton();
		 math.add(label);
		// math.addActionListener(opening);
		 subjectPanel.add(math);

		// .addActionListener(opening); need button

	}

}
