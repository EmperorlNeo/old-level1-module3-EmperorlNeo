import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
	JButton normal = new JButton();
	JButton mole = new JButton("Mole!");
	Date StartDate;
	int Hits = 0;
	int Miss = 0;
	int r;

	public static void main(String[] args) {
		WhackAMole WAM = new WhackAMole();

	}

	public WhackAMole() {
		framestuff();
		int r = rand.nextInt(24);
		drawButtons(r);
		mole.addActionListener(this);
		StartDate = new Date();
	}

	public void drawButtons(int random) {
		panel.removeAll();
		for (int i = 0; i <= 23; i++) {
			if (random == i) {
				panel.add(mole);

			} else {
				JButton normal = new JButton();
				panel.add(normal);
				normal.addActionListener(this);
			}
		}

	}

	public void framestuff() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.setSize(300, 300);
		frame.setResizable(false);
		frame.setLocation(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("pressed " + ((JButton) e.getSource()).getText() + " button");
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == mole) {
			frame.dispose();
			framestuff();
			int r = rand.nextInt(24);
			drawButtons(r);
			Hits++;
			if(Hits >= 10) {
				endGame(StartDate, Hits);
				System.exit(0);
			}
		}
		
		else {
			speak(" no");
			frame.dispose();
			framestuff();
			int r = rand.nextInt(24);
			drawButtons(r);
			Miss++;
			if(Miss >= 5) {
				JOptionPane.showMessageDialog(null, "You Lost");
				endGame(StartDate, Hits);
				System.exit(0);
			}
		}

	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
