import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import extra.PIGSTUFF;

public class PigLatinTranslator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JButton button = new JButton();

	public static void main(String[] args) {
		PigLatinTranslator PLT = new PigLatinTranslator();
		PLT.JFrameStuff();
		PLT.getText();
	}

	public void JFrameStuff() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setPreferredSize(new Dimension(450, 30));
		frame.setTitle("Neo's Pig Latin Translator");
		panel.add(text1);
		panel.add(button);
		button.setText("translate");
		panel.add(text2);
		frame.setSize(600, 60);
		text1.setPreferredSize(new Dimension(230, 30));
		text2.setPreferredSize(new Dimension(230, 30));
		frame.setLocation(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void getText() {
		String a = text1.getText();
		String b = text2.getText();
		translate(a);
		translate(b);
	}

    /**
    * Method to test whether a character is a letter or not.
    * @param c The character to test
    * @return True if it's a letter
    */
    private static boolean isLetter(char c) {
         return ( (c >= 'A' && c <= 'Z') || (c >='a' && c <= 'z') );
    }

    /**
    * Method to translate one word into pig latin.
    * @param word The word in english
    * @return The pig latin version
    */
    private static String pigWord(String word) {
         int split = firstVowel(word);
         return word.substring(split)+"-"+word.substring(0, split)+"ay";
    }

    /**
    * Method to translate a sentence word by word.
    * @param s The sentence in English
    * @return The pig latin version
    */
    public String translate(String s) {
         String latin = "";
         int i = 0;
         while (i < s.length()) {

    // Take care of punctuation and spaces
         while (i < s.length() && !isLetter(s.charAt(i))) {
              latin = latin + s.charAt(i);
              i++;
         }

    // If there aren't any words left, stop.
         if (i>=s.length()) break;

    // Otherwise we're at the beginning of a word.
         int begin = i;
         while (i < s.length() && isLetter(s.charAt(i))) {
              i++;
         }
    // Now we're at the end of a word, so translate it.
         int end = i;
         latin = latin + pigWord(s.substring(begin, end));
         }
         return latin;
    }

    /**
    * Method to find the index of the first vowel in a word.
    * @param word The word to search
    * @return The index of the first vowel
    */
    	private static int firstVowel(String word) {
         word = word.toLowerCase();
         for (int i=0; i < word.length(); i++)
              if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
                   word.charAt(i)=='i' || word.charAt(i)=='o' ||
                   word.charAt(i)=='u')
                   return i;
              return 0;
    }
}