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
	JLabel label = new JLabel();
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
		frame.setSize(1536, 600);
		frame.setLocation(300, 250);
		panel.add(button);
		button.setText("SPIN");
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("pressed " + ((JButton) e.getSource()).getText() + " button");
		JButton buttonPressed = (JButton) e.getSource();
		if (button == buttonPressed) {
			showImages();
		}
	}

	public void showImages() {
		int r = rand.nextInt(5);
		System.out.println(r);
		if (r == 0) {
			loadImageFromComputer("7.png");

		}
		if (r == 1) {
			loadImageFromComputer("Bell.png");
		}
		if (r == 2) {
			loadImageFromComputer("Cherry.png");
		}
		if (r == 3) {
			loadImageFromComputer("Grapes.png");
		}
		if (r == 4) {
			loadImageFromComputer("Lemon.png");
		}
		if (r == 5) {
			loadImageFromComputer("Orange.png");
		}
		int s = rand.nextInt(5);
		System.out.println(s);
		if (s == 0) {
			loadImageFromComputer("7.png");
		}
		if (s == 1) {
			loadImageFromComputer("Bell.png");
		}
		if (s == 2) {
			loadImageFromComputer("Cherry.png");
		}
		if (s == 3) {
			loadImageFromComputer("Grapes.png");
		}
		if (s == 4) {
			loadImageFromComputer("Lemon.png");
		}
		if (s == 5) {
			loadImageFromComputer("Orange.png");
		}
		int w = rand.nextInt(5);
		System.out.println(w);
		if (w == 0) {
			loadImageFromComputer("7.png");
		}
		if (w == 1) {
			loadImageFromComputer("Bell.png");
		}
		if (w == 2) {
			loadImageFromComputer("Cherry.png");
		}
		if (w == 3) {
			loadImageFromComputer("Grapes.png");
		}
		if (w == 4) {
			loadImageFromComputer("Lemon.png");
		}
		if (w == 5) {
			loadImageFromComputer("Orange.png");
		}
		if(r==s && s==w) {
			JOptionPane.showMessageDialog(null, "YOU WIN");
			win=+1;
			System.out.println(win);
		}
	}
	
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}
