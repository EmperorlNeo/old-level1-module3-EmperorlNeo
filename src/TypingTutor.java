import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor extends KeyAdapter {
	JFrame frame = new JFrame();
	char currentLetter;
	JLabel label = new JLabel();
	static TypingTutor tt;
	Date timeAtStart = new Date();

	public static void main(String[] args) {
		tt = new TypingTutor();
		tt.frameStuff();
		tt.currentLetter = tt.generateRandomLetter();
		tt.LabelStuff(tt.currentLetter);
//		tt.showTypingSpeed();
	}

	private void frameStuff() {
		frame.setTitle("Type or DIE");
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.addKeyListener(this);
	}

	private void LabelStuff(char currentLetter) {
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(80.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
	}

	private char generateRandomLetter() {

		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public void keyPressed(KeyEvent e) {
		char j = (char) (e.getKeyCode());
		j = Character.toLowerCase(j);
		if (j == currentLetter) {
			System.out.println("correct");
			frame.getContentPane().setBackground(Color.GREEN);
		} else {
			frame.getContentPane().setBackground(Color.RED);
		}
//		label.setText("" + currentLetter);

		System.out.println("you typed: " + j);
		System.out.println(currentLetter);
//		currentLetter = generateRandomLetter();
	}

	public void keyReleased(KeyEvent e) {
		tt.currentLetter = generateRandomLetter();
		label.setText("" + tt.currentLetter);

	}

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}

}
// fix the SHOWTYPINGSPEED() thing in the main method