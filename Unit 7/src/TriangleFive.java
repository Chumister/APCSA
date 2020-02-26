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
		setLetter('b');
		setAmount(0);
	}

	public TriangleFive(char b, int amt)
	{
		setLetter(b);
		setAmount(amt);
	}

	public void setLetter(char b)
	{
		letter = b;

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
					to += (char) (letter+i);
				}
				to += " ";
			}
			amount--;
			to += "\n";

	}
		return to;
}
}