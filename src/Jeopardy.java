import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/* Check out the Jeopardy Handout to see what the end result should look like: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton;
	private JButton fifthButton;
	private JPanel quizPanel;
	private int score = 0;
	private JLabel scoreBox = new JLabel("0");
	private int buttonCount = 0;
	private AudioClip sound;
	JFrame frame;
	int buttonLeft = 4;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		frame = new JFrame();
		quizPanel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
		frame.setVisible(true);
		// 2. Give your frame a title
		frame.setTitle("JeOpArDy");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		createHeader("General Knowledge");
		// 4. Add the header component to the quizPanel
		quizPanel.add(createHeader("General Knowledge"));
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
		firstButton=createButton("$200");
		// 7. Add the firstButton to the quizPanel
		quizPanel.add(firstButton);
		// 8. Write the code to complete the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.
		
		// 9. Use the secondButton variable to hold a button using the createButton
		// method
		secondButton=createButton("$400");
		// 10. Add the secondButton to the quizPanel
		quizPanel.add(secondButton);
		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		// 12. Write the code to complete the actionPerformed() method below
		
		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
		thirdButton=createButton("$600");
		quizPanel.add(thirdButton);
		thirdButton.addActionListener(this);
		
		fourthButton=createButton("$800");
		quizPanel.add(fourthButton);
		fourthButton.addActionListener(this);
		
		fifthButton=createButton("$1000");
		quizPanel.add(fifthButton);
		fifthButton.addActionListener(this);
		 /*
		 * [optional] Use the showImage or playSound methods when the user answers a
		 * question
		 */		
		
		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
		
	}

	private JButton createButton(String dollarAmount) {
		
		// Create a new JButton
		JButton button = new JButton();
		// Set the text of the button to the f
		button.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
		buttonCount =+ 5;
		// Return your new button instead of the temporary button
		
		return button;
	}

	public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:
		System.out.println("pressed " + ((JButton) e.getSource()).getText() + " button");
		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton
		if(buttonPressed == firstButton) {
			askQuestion("The person who lives next door", "Neighbor", 200);
			firstButton.setText("");
			buttonLeft = buttonLeft - 1;
		}
			// Call the askQuestion() method
		
		// Complete the code in the askQuestion() method. When you play the game, the score should change.
		
		// If the buttonPressed was the secondButton
		if(buttonPressed == secondButton) {
			askQuestion("Total digits on all my hands & feet", "20", 400);
			secondButton.setText("");
			buttonLeft = buttonLeft - 1;
		}
		
		if(buttonPressed == thirdButton) {
			askQuestion("It's the largest kingdom in the United Kingdom", "England", 600);
			thirdButton.setText("");
			buttonLeft = buttonLeft - 1;
		}
		
		if(buttonPressed == fourthButton) {
			askQuestion("6 x 28", "168", 800);
			fourthButton.setText("");
			buttonLeft = buttonLeft - 1;
		}
		
		if(buttonPressed == fifthButton) {
			askQuestion("This was the second U.S. president to live in the first president to live in the first White House", "Thomas Jefferson", 1000);
			fifthButton.setText("");
			buttonLeft = buttonLeft - 1;
		}
		
			// Call the askQuestion() method with a harder question
		
		// Clear the text on the button that was pressed (set the button text to nothing)
	}
	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		
		// Use the playJeopardyTheme() method to play music while the use thinks of an answer
		playJeopardyTheme();
		// Remove this temporary message and replace it with a pop-up that asks the user the question
		String answer= JOptionPane.showInputDialog(null, question);
		
		// Stop the theme music when they have entered their response. Hint: use the sound variable 
		sound.stop();
		// If the answer is correct
			if(answer.equalsIgnoreCase(correctAnswer)) {
				score = score + prizeMoney;
				JOptionPane.showMessageDialog(null, "Corrrect!");
				
			}
			// Increase the score by the prizeMoney
		
			// Pop up a message to tell the user they were correct
		
		// Otherwise
			else {
				score = score - prizeMoney;
				JOptionPane.showMessageDialog(null, "Incorrect");
			}
			// Decrement the score by the prizeMoney
		
			// Pop up a message to tell the user they were wrong and give them the correct answer
		
		// Call the updateScore() method
		updateScore();
	}

	public void playJeopardyTheme() {
		try {
			sound = JApplet.newAudioClip(getClass().getResource("jeopardy.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
		if(buttonLeft == 0){
			frame.dispose();
		}
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}