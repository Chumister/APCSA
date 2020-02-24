//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('a');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;

	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String to = "";
		char letter = this.letter;
		int amount = this.amount;
		for (int times = 0; times < amount; times++) {
			for (int i = 0; i < amount; i++) {
				for (int a = amount; a > i; a--) {
					to += (char) (letter + i);
				}
				to += " ";
			}
			amount--;
			to += "\n";

	}
		return to;
}
}