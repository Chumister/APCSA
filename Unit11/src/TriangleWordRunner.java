//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	private static final TriangleWordRunner instance = new TriangleWordRunner();
	
	public static void main(String[] args) {
		instance.execute();
	}
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		char c;
		boolean firstRun = true;
		do {
			if (!firstRun)
				printLine();
			print("Enter a word :: ");
			TriangleWord.printTriangle(scan.next());
			
			printLine();
			print("Do you want to enter more sample input? ");
			
			c = scan.next().charAt(0);
			firstRun = false;
		} while (c == 'Y' || c == 'y');
		scan.close();
	}
}
