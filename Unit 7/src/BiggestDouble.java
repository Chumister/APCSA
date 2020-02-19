//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double big = 0.0;
		if (one>two&&one>three&&one>four) {
			big = one;
		}else if(two>one&&two>three&&two>four) {
			big = two;
		}else if (three>two&&three>one&&three>four) {
			big = three;
		}else {
			big = four;
		}
		return big;
	}

	public String toString()
	{
	   return ("biggest = " +getBiggest());
	}
}