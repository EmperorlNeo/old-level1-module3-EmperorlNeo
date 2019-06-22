import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	static Random rand = new Random();
	JButton normal = new JButton();
	JButton mole = new JButton("Mole!");
	int r;

	public static void main(String[] args) {
		WhackAMole WAM = new WhackAMole();
		WAM.framestuff();
		int r = rand.nextInt(24);
		WAM.drawButtons(r);
		
	}
	public void drawButtons(int random) {
		for (int i = 0; i <= 23; i++) {
			if(random == i) {
		
				panel.add(mole);
				mole.addActionListener(this);
			}
			else {
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
		frame.setLocation(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("pressed " + ((JButton) e.getSource()).getText() + " button");
		JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed != mole) {
		speak(" no");
	}
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
