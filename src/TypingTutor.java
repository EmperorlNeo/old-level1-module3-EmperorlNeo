import java.util.Random;

import javax.swing.JFrame;

public class TypingTutor {
	JFrame frame = new JFrame ();
	char currentLetter;
	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();
		tt.frameStuff();
		tt.currentLetter = tt.generateRandomLetter();
	}
	private void frameStuff() {
		frame.setTitle("Type or DIE");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private char generateRandomLetter() {
		
		 Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
}
