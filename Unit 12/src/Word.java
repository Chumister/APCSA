import java.util.Arrays;
import java.util.Comparator;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Word {
	private String word;
	private static final String VOWELS = "AEIOUaeiou"; // only one

	public Word() {
		setWord("Shotgun");
	}

	public Word(String word) {
		setWord(word);
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getNumVowels() {
		int count = 0;
		for (int i = 0; i < word.length(); i++)
			if (VOWELS.contains(String.valueOf(word.charAt(i))))
				count++;
		return count;
	}

	public int getLength() {
		return word.length();
	}

	public String toString() {
		return word;
	}
}