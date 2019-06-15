import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		WhackAMole WAM = new WhackAMole();
		WAM.framestuff();
	}
	public void forButtons() {
		for(int i = 0; i<25; i ++) {
			panel.add(new JButton());
		}
	}
	public void framestuff() {
		frame.setVisible(true);
		frame.add(panel);
		frame.pack();

		
	}

	public void drawButtons() {

	}
}
