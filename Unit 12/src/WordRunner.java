//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
public static void main( String args[] ) throws IOException
{
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
    test.sortByLength();
    System.out.println(test);
}
}


