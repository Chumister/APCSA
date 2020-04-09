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
	private static final WordSortTwoRunner instance = new WordSortTwoRunner();

	public static void main(String args[]) {
		instance.execute();
	}
	protected final void printLine(Object... arg0) {
		pL(arg0);
	}
	public static final void pL(Object... arg0) {
		if (arg0.length == 0) {
			System.out.println();
		}
		for (Object obj : arg0) {
			System.out.println(obj);
		}
	}
	
	public void execute() {
		WordSortTwo ws = new WordSortTwo("5");
		ws.sort();
		printLine(ws);
		ws.setWords("WHAT TIME WAS IT?");
		ws.sort();
		printLine(ws);
		ws.setWords("THE BIG BROWN FOX IS LAZY!");
		ws.sort();
		printLine(ws);
		ws.setWords("I AM SAM SAM I AM SAM IS BIG");
		ws.sort();
		printLine(ws);
		ws.setWords("1234 ONE TWO 5678");
		ws.sort();
		printLine(ws);
		ws.setWords("a b i j 1 2 3");
		ws.sort();
		printLine(ws);
	}

}