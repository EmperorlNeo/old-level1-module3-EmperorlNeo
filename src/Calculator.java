import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int a;
	int b;
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
	//	calc.addActionListener(this);
	}

	public void frameStuff() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setTitle("Simple Calculator");
		panel.add(text1);
		panel.add(text2);
		panel.add(button1);
		button1.setText("add");
		button1.addActionListener(this);
		panel.add(button2);
		button2.setText("sub");
		button2.addActionListener(this);
		panel.add(button3);
		button3.setText("mul");
		button3.addActionListener(this);
		button4.setText("div");
		button4.addActionListener(this);
		panel.add(button4);
		frame.setSize(400, 150);
		text1.setPreferredSize(new Dimension(170, 24));
		text2.setPreferredSize(new Dimension(170, 24));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void add() {
		int y = Integer.parseInt(text1.getText());
		int g = Integer.parseInt(text2.getText());
		System.out.println(y + g);
	//	int f = y+g;
	//	panel.add(button1, f);
	}

	public void substract() {
		int y = Integer.parseInt(text1.getText());
		int g = Integer.parseInt(text2.getText());
		System.out.println(y - g);
	//	int f = y-g;
	//	panel.add(button2, f);
	}

	public void multiply() {
		int y = Integer.parseInt(text1.getText());
		int g = Integer.parseInt(text2.getText());
		System.out.println(y * g);
	//	int f = y*g;
	//	panel.add(button3, f);
	}

	public void divide() {
		int y = Integer.parseInt(text1.getText());
		int g = Integer.parseInt(text2.getText());
		System.out.println(y / g);
	//	int f = y/g;
	//	panel.add(button4, f);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("pressed " + ((JButton) e.getSource()).getText() + " button");
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button1) {
			add();
		}
		if (buttonPressed == button2) {
			substract();
		}
		if (buttonPressed == button3) {
			multiply();
		}
		if (buttonPressed == button4) {
			divide();
		}
	}
}