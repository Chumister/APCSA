//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer>numArray)
	{
		for (int num = 0; (num < numArray.size() && num+1< numArray.size()); num ++)
			if (numArray.get(num) > numArray.get(num+1))
				return true;
			else 
				return false;
		return false;
	}	
}