import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlotMachine {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
	JButton button = new JButton();
	int r;
	int s;
	int w;
	public static void main(String[] args) {
		SlotMachine slot = new SlotMachine();
	}

	public SlotMachine() {
		frameStuff();
		showImages();
	}

	public void frameStuff() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("SLOT MACHINE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1536,600);
		panel.add(button);
		button.setText("SPIN");
	}
	public void showImages() {
		int r = rand.nextInt(5);
		System.out.println(r);
		int s = rand.nextInt(5);
		System.out.println(s);
		int w = rand.nextInt(5);
		System.out.println(w);
	}
}
