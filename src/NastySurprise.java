import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JLabel label = new JLabel();
	JFrame frame3 = new JFrame();
	JPanel panel1 = new JPanel();
	String scary = "scary.jpg";
	String pup = "pup.jpg";

	public static void main(String[] args) {
		new NastySurprise().createUI();

	}

/*	private static void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.setSize(3000, 3000);
			imageLabel.setSize(3000, 3000);
			//frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
*/
	private void createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);

		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame1 = new JFrame();
		frame1.add(imageLabel);
		frame1.setVisible(true);
		frame1.setSize(1900, 1900);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button) {
			createLabelImage(pup);
			
			//	showPictureFromTheInternet("https://cdn.akc.org/Marketplace/Breeds/Siberian_Husky_SERP.jpg");
		}
		if (buttonPressed == button2) {
			createLabelImage(scary);
		//	showPictureFromTheInternet("https://i.pinimg.com/236x/18/77/97/1877975c291e712e9567692d80f664c3--creepy-dolls-creepy-art.jpg?b=t");
		}
	}

	void createUI() {
		frame3.setVisible(true);
		frame3.setSize(1920, 1920);
		frame3.add(panel1);
		panel1.setBackground(Color.BLACK);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.BLACK);
		panel.setBackground(Color.BLACK);
		frame.setTitle("OR");
		panel.add(button);
		panel.add(button2);
		button.setText("Trick");
		button2.setText("Treat");
		button.setPreferredSize(new Dimension(250, 350));
		button2.setPreferredSize(new Dimension(250, 350));
		button.setVisible(true);
		frame.pack();
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.setLocation(650, 350);
		frame3.setBackground(Color.BLACK);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
// If statements and action listeners so that you could put images with the buttons DONE
// Resize images to scale DONE
// change window size DONE
// move buttons to middle of screen. DONE