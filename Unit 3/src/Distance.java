//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	double addition;
	double addition2;
	public Distance()
	{
		
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		
		addition = x1+x2;
		addition2 = y1+y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		
	}

	public void calcDistance()
	{
		
		sqrt(addition+addition2);
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
		System.out.println("distance =" + distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		double.toString();
		return "";
	}
}