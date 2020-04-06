//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
private static final NumberShifterRunner instance = new NumberShifterRunner();
	
	public static void main(String args[]) throws IOException {
		instance.execute();
	}
	
	public void execute() {
		for (int i = 0; i < 1; i++) {
			int[] array = NumberShifter.makeLucky7Array(20);
			printLine(Arrays.toString(array));
			NumberShifter.shiftEm(array);
			printLine(Arrays.toString(array));
		}
	}

	private void printLine(String string) {
		// TODO Auto-generated method stub
		
	}
}



