//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;

import java.io.InputStream;

import static java.lang.Math.*;

public class DistanceRunner
{

	public static void main( String[] args )
	{
		Scanner board = new Scanner(in);
		out.print("Enter x1 :: ");
		int x1 = board.nextInt();
		
		out.print("Enter x2 :: ");
		int x2 = board.nextInt();
		
		out.print("Enter y1 :: ");
		int y1 = board.nextInt();
		
		out.print("Enter y2 :: ");
		int y2 = board.nextInt();
		
		Distance tester = new Distance(x1,x2,y1,y2);
		tester.calcDistance();
		tester.print();
	}
}