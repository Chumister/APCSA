//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double sight;

		double sight2;
		double slope;

		sight = y2-y1;
		sight2 = x2-x1;
		slope = sight / sight2;
		return slope;
	}

}