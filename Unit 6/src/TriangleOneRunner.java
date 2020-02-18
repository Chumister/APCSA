//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		 
		        Scanner keyboard = new Scanner(System.in);
		        System.out.print("Enter a word :: ");
		        String a =keyboard.nextLine();
		        TriangleOne test = new TriangleOne(a);
		        test.print();//modification for method call
		        System.out.println("");
			
	}
}