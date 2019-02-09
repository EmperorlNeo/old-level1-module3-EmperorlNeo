import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
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
	button.setPreferredSize(new Dimension(950, 1200));
	button2.setPreferredSize(new Dimension(950, 1200));
	button.setVisible(true);
	frame.setSize(2100, 1800);
	frame.pack();

	showPictureFromTheInternet("https://cdn.akc.org/Marketplace/Breeds/Siberian_Husky_SERP.jpg");
}
	private static void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
}
}
//if statements and action listeners so that you could put images with the buttons