
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
	JButton button = new JButton();

	public static void main(String[] args) {
		GetLatestTweet GLT = new GetLatestTweet();
		GLT.JFrameStuff();

	}

	public void JFrameStuff() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		text.setPreferredSize(new Dimension(200, 30));
		button.setText("Search the Twitterverse");
		button.addActionListener(this);
		frame.setTitle("The Amazing Tweet Retriever");
		frame.setSize(400, 60);
		frame.setLocation(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("pressed " + ((JButton) e.getSource()).getText() + " button");
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button) {
			System.out.println("Tweet, Tweet");
			System.out.println("...");
			System.out.println("Tweet, Tweet");
			String a = text.getText();
			getLatestTweet(a);
			JOptionPane.showMessageDialog(null, getLatestTweet(a));
		}
	}

	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();

		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}

}
