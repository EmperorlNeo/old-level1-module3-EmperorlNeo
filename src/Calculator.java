import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JLabel label = new JLabel();

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.frameStuff();
	}

	public void frameStuff() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(text1);
		panel.add(text2);
		panel.add(button1);
		button1.setText("add");
		panel.add(button2);
		button2.setText("sub");
		panel.add(button3);
		button3.setText("mul");
		button4.setText("div");
		panel.add(button4);
		frame.setSize(400, 150);
		frame.add(label);
		label.setText();
		text1.setPreferredSize(new Dimension(170, 24));
		text2.setPreferredSize(new Dimension(170, 24));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void add() {

	}

	public void substract() {

	}

	public void multiply() {

	}

	public void divide() {

	}
}
