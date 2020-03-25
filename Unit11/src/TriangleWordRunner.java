//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	private static String word;
	
	public static void main(String[] args) {
		TriangleWord t=new TriangleWord();
		Scanner s=new Scanner(in);
		System.out.println("Enter the word: ");
		word=s.next();
		System.out.println(t.toString());}
}
