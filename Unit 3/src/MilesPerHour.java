//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		
	}

	public void calcMPH()
	{
		int calc;
		calc = minutes;
		int vars;
		vars = calc/2;
		int vars2;
		vars2 = hours +vars;
		mph = distance / vars2;
	}
	

	public void print()
	{
	System.out.println(distance + "miles in" + hours +"hours and" + minutes + "MPH: " + mph + "miles/hour");
	}
	
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}