import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public static void main(String[] args) {

		ChuckleClicker chuck = new ChuckleClicker();
		chuck.makeButtons();
	}

	private void makeButtons() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.setBackground(Color.BLACK);
		frame.setVisible(true);
		frame.setSize(150,80);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1.setText("Joke");
		button1.setPreferredSize(new Dimension(50,40));
		button1.setBackground(Color.RED);
		button1.setOpaque(true);
		button2.setText("Punchline");
		button2.setPreferredSize(new Dimension(90,40));
		button2.setBackground(Color.BLUE);
		button2.setOpaque(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed==button1) {
			JOptionPane.showMessageDialog(null, "A man walks into a bar with a duck under his arm.\n" + 
					"\n" + 
					"The bartender asks: \"Say, where did you find the pig?\"\n" + 
					"\n" + 
					"\"It's not a pig, it's a duck,\" the man answers.");
		}
		if(buttonPressed == button2) {
			JOptionPane.showMessageDialog(null,	"TO WHICH THE BARMAN REPLIES: ''I WAS TALKING TO THE DUCK''");
		}
		
	}
}
// Static and Non Static