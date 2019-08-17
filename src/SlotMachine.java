import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
	JButton button = new JButton();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	int r;
	int s;
	int w;
	int win;

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
		frame.setSize(1900, 700);
		frame.setLocation(0, 0);
		panel.add(button);
		button.setText("SPIN");
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("pressed " + ((JButton) e.getSource()).getText() + " button");
		JButton buttonPressed = (JButton) e.getSource();
		if (button == buttonPressed) {
			for (int i = 0; i <= 3; i++) {
				panel.remove(label1);
				panel.remove(label2);
				panel.remove(label3);
				showImages();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.invalidate();
			}
		}
	}

	public void showImages() {
		int r = rand.nextInt(9);
		System.out.println(r);
		if (r == 0) {
			label1 = loadImageFromComputer("7.png");
		}
		if (r == 1) {
			label1 = loadImageFromComputer("Bell.png");
		}
		if (r == 2) {
			label1 = loadImageFromComputer("Cherry.png");
		}
		if (r == 3) {
			label1 = loadImageFromComputer("Grapes.png");
		}
		if (r == 4) {
			label1 = loadImageFromComputer("Lemon.png");
		}
		if (r == 5) {
			label1 = loadImageFromComputer("Orange.png");
		}
		if (r == 6) {
			label1 = loadImageFromComputer("OneBar.png");
		}
		if (r == 7) {
			label1 = loadImageFromComputer("ThreeBar.png");
		}
		if (r == 8) {
			label1 = loadImageFromComputer("Three7.png");
		}
		if (r == 9) {
			label1 = loadImageFromComputer("Watermelon.png");
		}

		panel.add(label1);
		int s = rand.nextInt(9);
		System.out.println(s);
		if (s == 0) {
			label2 = loadImageFromComputer("7.png");
		}
		if (s == 1) {
			label2 = loadImageFromComputer("Bell.png");
		}
		if (s == 2) {
			label2 = loadImageFromComputer("Cherry.png");
		}
		if (s == 3) {
			label2 = loadImageFromComputer("Grapes.png");
		}
		if (s == 4) {
			label2 = loadImageFromComputer("Lemon.png");
		}
		if (s == 5) {
			label2 = loadImageFromComputer("Orange.png");
		}
		if (s == 6) {
			label2 = loadImageFromComputer("OneBar.png");
		}
		if (s == 7) {
			label2 = loadImageFromComputer("ThreeBar.png");
		}
		if (s == 8) {
			label2 = loadImageFromComputer("Three7.png");
		}
		if (s == 9) {
			label2 = loadImageFromComputer("Watermelon.png");
		}
		panel.add(label2);
		int w = rand.nextInt(9);
		System.out.println(w);
		if (w == 0) {
			label3 = loadImageFromComputer("7.png");
		}
		if (w == 1) {
			label3 = loadImageFromComputer("Bell.png");
		}
		if (w == 2) {
			label3 = loadImageFromComputer("Cherry.png");
		}
		if (w == 3) {
			label3 = loadImageFromComputer("Grapes.png");
		}
		if (w == 4) {
			label3 = loadImageFromComputer("Lemon.png");
		}
		if (w == 5) {
			label3 = loadImageFromComputer("Orange.png");
		}
		if (w == 6) {
			label3 = loadImageFromComputer("OneBar.png");
		}
		if (w == 7) {
			label3 = loadImageFromComputer("ThreeBar.png");
		}
		if (w == 8) {
			label3 = loadImageFromComputer("Three7.png");
		}
		if (w == 9) {
			label3 = loadImageFromComputer("Watermelon.png");
		}
		panel.add(label3);
		frame.pack();
		if (r == s && s == w) {
			JOptionPane.showMessageDialog(null, "YOU WIN");
			win = +1;
			System.out.println("Times Won: " + win);
		}
	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}
// TIMER IN ACTION PERFORMED TO UPDATE UI, START TIMER
// java api timer (look up)
//fsefgsegh