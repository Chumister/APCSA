

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordRunner
{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("words.dat"));

	    int size = file.nextInt();
	    file.nextLine();
	    Word test = new Word();
	    test.setSize(size);
	    String word = "";

	    for(int i = 0; i < size; i++)
	    {
	        word = file.next();
	        test.setWord(word);
	        test.add(i, word);
	    }
	    test.sortByLength(args);
	    System.out.println(test);
	}	
}



