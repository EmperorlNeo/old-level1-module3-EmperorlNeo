import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker {

	public static void main(String[] args) {

		ChuckleClicker chuck = new ChuckleClicker();
		chuck.makeButtons();
	}

	private void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1.setText("Joke");
		button1.setSize(10,10);
		button2.setText("Punchline");
		button2.setSize(10,10);

		
	}
}