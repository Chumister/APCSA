//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
        setWords(sentence);
	}

	 public void setWords(String sentence){
	    wordRay = sentence.split(" ");
	 
	        }
	public void sort()
	{
        Arrays.sort(wordRay);
	}

	public String toString()
	{
		  String output="";
          for (int index = 0; index < wordRay.length;index++){
          System.out.println("Word " + index + " :: " + wordRay [index]);
          }
          return output+"\n\n";
	}
}