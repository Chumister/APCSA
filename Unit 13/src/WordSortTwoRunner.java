//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("wordsorttwo.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			String sentence = file.nextLine();
			WordSortTwo ws = new WordSortTwo("abc ABC 12321 fred alexander");
			ws.sort();
			printLine(ws);
			ws.setWords("a zebra friendly acrobatics 435 TONER PRinTeR");
			ws.sort();
			printLine(ws);
			ws.setWords("b x 4 r s y $");
			ws.sort();
			printLine(ws);
			ws.setWords("123 ABC abc 034 dog cat sally sue bob 2a2");
			ws.sort();
			printLine(ws);
		}
	}

	private static void printLine(WordSortTwo ws) {
		// TODO Auto-generated method stub
		
	}
}